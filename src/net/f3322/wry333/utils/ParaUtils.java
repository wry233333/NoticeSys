package net.f3322.wry333.utils;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.bean.Item;
import net.f3322.wry333.bean.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ParaUtils {
    /**
     * 自动封装user对象方法
     * @param request
     * @return
     */
    public static User populate (HttpServletRequest request){
        User user = new User();
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
        return user;
    }

    /**
     * 自动封装书籍
     * @param request
     * @return
     */
    public static Book populate_n(HttpServletRequest request){
        Book book = new Book();
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(book,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
        return book;
    }

    /**
     * 自动封装订单
     * @param request
     * @return
     */
    public static Item populate_i(HttpServletRequest request){
        Item item = new Item();
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(item,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
        return item;
    }

}
