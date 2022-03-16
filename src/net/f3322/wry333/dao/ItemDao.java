package net.f3322.wry333.dao;

import net.f3322.wry333.bean.Item;

import java.util.List;

public interface ItemDao {
    List<Item> findListByID(String id);
}
