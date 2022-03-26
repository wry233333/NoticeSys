package net.f3322.wry333.web.servlet;

import net.f3322.wry333.service.ItemService;
import net.f3322.wry333.service.ItemServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理用户借阅加时操作的servlet
 */
@WebServlet("/itemAdjServlet1")
public class ItemAdjServlet123 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String l_id = (String) req.getParameter("l_id");
        ItemService itemService = new ItemServiceImpl();
        if (itemService.adjTime(l_id)) {
            req.setAttribute("adj_msg","已延长30天");
            req.getRequestDispatcher("/itemListServlet1").forward(req,resp);
        }
        else {
            resp.sendError(500,"修改失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
