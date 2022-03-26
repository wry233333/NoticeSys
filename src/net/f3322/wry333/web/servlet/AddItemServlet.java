package net.f3322.wry333.web.servlet;


import net.f3322.wry333.bean.Book;
import net.f3322.wry333.bean.Item;
import net.f3322.wry333.service.AddService;
import net.f3322.wry333.service.AddServiceImpl;
import net.f3322.wry333.service.ItemService;
import net.f3322.wry333.service.ItemServiceImpl;
import net.f3322.wry333.utils.ParaUtils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@WebServlet("/addItemServlet")
public class AddItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {






        //1.设置编码
        request.setCharacterEncoding("utf-8");

        //2.获取参数
        Map<String,String[]> map = request.getParameterMap();

        //3.封装对象
        Item item = new Item();
        try {
            BeanUtils.populate(item,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //4.调用Service保存
        ItemService service = new ItemServiceImpl();
        service.addItem(item);

        //5.跳转到itemListServlet
        response.sendRedirect(request.getContextPath()+"/itemListServlet1");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
