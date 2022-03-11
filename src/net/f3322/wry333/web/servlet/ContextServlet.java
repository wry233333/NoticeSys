package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.Notice;
import net.f3322.wry333.service.NoticeService;
import net.f3322.wry333.service.NoticeServiceImpl;

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
        String name = req.getParameter("name");
        NoticeService noticeService= new NoticeServiceImpl();
        Notice notice = noticeService.find(name);
        req.setAttribute("notice",notice);
        req.getRequestDispatcher("/jsp/notice/context.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
