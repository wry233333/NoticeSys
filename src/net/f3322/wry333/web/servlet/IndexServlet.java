package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.bean.BookClasses;
import net.f3322.wry333.service.BookService;
import net.f3322.wry333.service.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/indexServlet")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String c_id = (String) req.getParameter("c_id");
        BookService bookService = new BookServiceImpl();
        List<Book> list = bookService.search(c_id);
        List<BookClasses> strings = bookService.bookClasses();
        for (Book l:list) {
            l.toString();
        }
        req.setAttribute("list",list);
        req.setAttribute("classes",strings);
        req.setAttribute("this",c_id);
        req.getRequestDispatcher("/jsp/notice/main.jsp").forward(req,resp);
    }
}
