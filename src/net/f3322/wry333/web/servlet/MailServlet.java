package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.User;
import net.f3322.wry333.dao.UserDao;
import net.f3322.wry333.dao.UserDaoImpl;
import net.f3322.wry333.utils.MailUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;


/**
 * 用于找回密码发送密码重置邮件的servlet
 */
@WebServlet("/mailServlet")
public class MailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        User t =new User();
        t.setEmail(email);
        UserDao userDao = new UserDaoImpl();
        User user = userDao.findByEmail(t);
        if (user == null){
            req.setAttribute("reset_msg","用户不存在");
            req.getRequestDispatcher("/jsp/notice/resetpwd.jsp").forward(req,resp);
            return;
        }
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
