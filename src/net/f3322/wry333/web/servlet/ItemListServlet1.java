package net.f3322.wry333.web.servlet;


import net.f3322.wry333.bean.Item;
import net.f3322.wry333.service.ItemService;
import net.f3322.wry333.service.ItemServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/itemListServlet1")
public class ItemListServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ItemService service = new ItemServiceImpl();

        System.out.println("---------------------good");
        List<Item> items = service.findAll();

//        2.将List存入request域
        request.setAttribute("items",items);
//        3.转发到list.jsp
        request.getRequestDispatcher("/jsp/notice/list.jsp").forward(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

}
