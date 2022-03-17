package net.f3322.wry333.service;

import net.f3322.wry333.bean.Item;

import java.util.List;

public interface ItemService {
    List<Item> list(String id);

    boolean adjTime(String l_id);

    boolean  addItem(Item item, String time);
}
