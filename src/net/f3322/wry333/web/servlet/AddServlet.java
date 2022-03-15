package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.service.AddService;
import net.f3322.wry333.service.AddServiceImpl;
import net.f3322.wry333.utils.ParaUtils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book add =ParaUtils.populate_n(req);
        AddService as = new AddServiceImpl();
        if(as.insert(add)){
            req.setAttribute("add_msg","添加成功");
            req.getRequestDispatcher("/jsp/notice/AddPost.jsp").forward(req,resp);
        }
        else {
            req.setAttribute("add_msg","添加失败");
            req.getRequestDispatcher("/jsp/notice/AddPost.jsp").forward(req,resp);
        }
    }
}
