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


@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = ParaUtils.populate(req);
        UserService us = new UserServiceImpl();
        if(us.register(user)){
            req.setAttribute("login_msg","注册成功请登录");
            req.getRequestDispatcher("/jsp/bin/Login.jsp").forward(req,resp);
        }
        else {
            req.setAttribute("reg_msg","注册失败请重试");
            req.getRequestDispatcher("/jsp/bin/Register.jsp").forward(req,resp);
        }
    }
}
