package net.f3322.wry333.service;

import net.f3322.wry333.bean.Item;
import net.f3322.wry333.dao.ItemDao;
import net.f3322.wry333.dao.ItemDaoImpl;

import java.util.List;

public class ItemServiceImpl implements ItemService{
    @Override
    public List<Item> list(String id) {
        ItemDao itemDao =new ItemDaoImpl();
        List<Item> list = itemDao.findListByID(id);
        return list;
    }
}
