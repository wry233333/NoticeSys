package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.User;
import net.f3322.wry333.service.UserService;
import net.f3322.wry333.service.UserServiceImpl;
import net.f3322.wry333.utils.ParaUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 *
 * 处理用户提交重置密码表单的servlet
 *
 */

@WebServlet("/resetServlet")
public class RestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = ParaUtils.populate(req);
        UserService userService = new UserServiceImpl();
        String check = (String)req.getSession().getAttribute("Check");
        String code = (String)req.getParameter("check-code");
        if(user!=null && userService.reset(user) && check.equals(code)){
            req.setAttribute("login_msg","修改成功");
            req.getRequestDispatcher("/jsp/bin/Login.jsp").forward(req,resp);
        }
        else {
            req.setAttribute("reset_msg","修改失败");
            req.getRequestDispatcher("/jsp/notice/resetpwd.jsp").forward(req,resp);
        }
    }
}
