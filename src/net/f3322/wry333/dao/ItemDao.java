package net.f3322.wry333.dao;

import net.f3322.wry333.bean.Item;

import java.util.List;

public interface ItemDao {
    List<Item> findListByID(String id);

    Item findByL_id(String l_id);

    boolean adjReturn_date(String l_id, String backTime);

    boolean addItem(Item item);
}
