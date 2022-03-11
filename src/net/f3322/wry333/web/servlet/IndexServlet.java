package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.Notice;
import net.f3322.wry333.service.NoticeService;
import net.f3322.wry333.service.NoticeServiceImpl;
import net.f3322.wry333.utils.ParaUtils;

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
        String institute = (String) req.getParameter("institute");
        NoticeService noticeService = new NoticeServiceImpl();
        List<Notice> list = noticeService.search(institute);
        for (Notice l:list) {
            l.toString();
        }
        req.setAttribute("list",list);
        req.getRequestDispatcher("/jsp/notice/main.jsp").forward(req,resp);
    }
}
