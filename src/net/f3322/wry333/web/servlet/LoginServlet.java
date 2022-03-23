package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.User;
import net.f3322.wry333.service.UserService;
import net.f3322.wry333.service.UserServiceImpl;
import net.f3322.wry333.utils.ParaUtils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 处理用户登录的servlet
 *
 *
 */

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = ParaUtils.populate(req);
        UserService us = new UserServiceImpl();
        User login_user = us.login(user);
        if(login_user != null){
            req.getSession().setAttribute("user",login_user);
            req.getRequestDispatcher("/indexServlet?c_id=1").forward(req,resp);
        }else {
            req.setAttribute("login_msg","账号或密码错误");
            req.getRequestDispatcher("/jsp/bin/Login.jsp").forward(req,resp);
        }

    }
}
