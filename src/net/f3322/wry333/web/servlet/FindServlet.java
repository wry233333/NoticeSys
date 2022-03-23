package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.service.FindService;
import net.f3322.wry333.service.FindServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FindServlet")
public class FindServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FindService findService = new FindServiceImpl();
        List<Book> list =findService.findallbook();
        for (Book l:list) {
            l.toString();
        }
        req.setAttribute("list",list);
        req.getRequestDispatcher("/jsp/notice/DoBOOK.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}