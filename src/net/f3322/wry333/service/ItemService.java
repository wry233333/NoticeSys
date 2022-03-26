package net.f3322.wry333.service;

import net.f3322.wry333.bean.Item;

import java.util.List;

public interface ItemService {
    List<Item> list(String id);

    boolean adjTime(String l_id);

    boolean  addItem(Item item, String time);

    /**
     * 查询所有借阅信息
     * @return
     */
    public List<Item> findAll();


    /**
     * 保存Item
     * @param item
     */
    void addItem(Item item);


    /**
     * 根据l_id删除item
     * @param l_id
     */
    void deleteItem(String l_id);
}
