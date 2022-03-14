package net.f3322.wry333.web.servlet;

import net.f3322.wry333.utils.MailUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;
@WebServlet("/mailServlet")
public class MailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        Random random = new Random();
        String result="";
        for (int i=0;i<6;i++)
        {
            result+=random.nextInt(10);
        }
        MailUtils.sendMail(email,"您的验证码是:"+result,"验证邮件");
        req.getSession().setAttribute("Check",result);
        req.setAttribute("reset_msg","已发送验证码");
        req.setAttribute("email",email);
        req.setAttribute("statue","false");
        req.getRequestDispatcher("/jsp/notice/resetpwd.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
