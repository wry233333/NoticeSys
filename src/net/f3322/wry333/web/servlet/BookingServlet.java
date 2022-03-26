package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.Item;
import net.f3322.wry333.service.ItemService;
import net.f3322.wry333.service.ItemServiceImpl;
import net.f3322.wry333.utils.ParaUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bookingServlet")
public class BookingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Item item = ParaUtils.populate_i(req);
        ItemService itemService = new ItemServiceImpl();
        String time = null;
        //后期可以添加更改借阅时间的页面
        if (itemService.addItem(item,time)) {
            req.setAttribute("adj_msg","已添加借阅记录");
            req.getRequestDispatcher("/itemListServlet").forward(req,resp);
        }
        else {
            resp.sendError(500,"插入借阅记录失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
