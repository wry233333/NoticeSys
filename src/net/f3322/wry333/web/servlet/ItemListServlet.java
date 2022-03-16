package net.f3322.wry333.web.servlet;

import net.f3322.wry333.bean.Item;
import net.f3322.wry333.bean.User;
import net.f3322.wry333.service.ItemService;
import net.f3322.wry333.service.ItemServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/itemListServlet")
public class ItemListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ItemService itemService = new ItemServiceImpl();
        User user = (User) req.getSession().getAttribute("user");
        List<Item> list = itemService.list(user.getId());
        if (list == null){
            return;
        }
        else {
            req.setAttribute("itemList",list);
            req.getRequestDispatcher("/jsp/list/ItemList.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
