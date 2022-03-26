package net.f3322.wry333.web.servlet;


import net.f3322.wry333.service.ItemService;
import net.f3322.wry333.service.ItemServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delItemServlet")
public class DelItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取id
        String l_id = request.getParameter("id");
        //2.调用service删除
        ItemService service = new ItemServiceImpl();
        service.deleteItem(l_id);


        request.getRequestDispatcher("/itemListServlet1").forward(request, response);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
