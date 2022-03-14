package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.service.BookService;
import net.f3322.wry333.service.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/contextServlet")
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String b_id = req.getParameter("b_id");
        BookService bookService = new BookServiceImpl();
        Book book = bookService.find(b_id);
        req.setAttribute("book", book);
        req.getRequestDispatcher("/jsp/notice/context.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
