package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.service.DeleteService;
import net.f3322.wry333.service.DeleteServiceImpl;
import net.f3322.wry333.utils.ParaUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] ids = req.getParameterValues("b_id");
        DeleteService service = new DeleteServiceImpl();
        service.delete(ids);
        req.getRequestDispatcher("/FindServlet").forward(req, resp);
    }
}