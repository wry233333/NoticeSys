package net.f3322.wry333.service;

import net.f3322.wry333.bean.Item;
import net.f3322.wry333.dao.ItemDao;
import net.f3322.wry333.dao.ItemDaoImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ItemServiceImpl implements ItemService{
    @Override
    public List<Item> list(String id) {
        ItemDao itemDao =new ItemDaoImpl();
        List<Item> list = itemDao.findListByID(id);
        return list;
    }

    @Override
    public boolean adjTime(String l_id) {
        ItemDao itemDao = new ItemDaoImpl();
        Item item = itemDao.findByL_id(l_id);
        String time_s = item.getReturn_date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date time = format.parse(time_s);
            Calendar ca = Calendar.getInstance();
            ca.setTime(time);
            ca.add(Calendar.DATE, 30);
            Date time1 = ca.getTime();
            String backTime = format.format(time1);
            if(itemDao.adjReturn_date(l_id,backTime)){
                return true;
            }
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }


    @Override
    public boolean addItem(Item item, String time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =new Date(System.currentTimeMillis());
        String current = format.format(date);
        item.setBorrow_date(current);
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.add(Calendar.DATE, 30);
        Date time1 = ca.getTime();
        String backTime = format.format(time1);
        item.setReturn_date(backTime);
        ItemDao itemDao =new ItemDaoImpl();
        if (itemDao.addItem(item)) {
            return true;
        }
        return false;
    }


    private ItemDao dao = new ItemDaoImpl();
    //    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<Item> findAll() {

        return dao.findAll();
    }

    @Override
    public void addItem(Item item) {

        dao.add(item);
    }

    @Override
    public void deleteItem(String l_id) {
        dao.delete(l_id);
    }
}
