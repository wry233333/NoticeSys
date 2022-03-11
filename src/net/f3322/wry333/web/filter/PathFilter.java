package net.f3322.wry333.web.filter;

import net.f3322.wry333.bean.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@WebFilter("/*")
public class PathFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();
        if(uri.contains("/index.jsp") || uri.contains("/jsp/bin/Login.jsp") || uri.contains("/jsp/bin/Register.jsp") || uri.contains("/registerServlet") || uri.contains("/loginServlet")) {
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            User user = (User) request.getSession().getAttribute("user");
            if (user != null){
                filterChain.doFilter(servletRequest,servletResponse);
            }
            else {
                request.setAttribute("login_msg","您未登录请先登录再访问");
                request.getRequestDispatcher("/jsp/bin/Login.jsp").forward(servletRequest,servletResponse);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
