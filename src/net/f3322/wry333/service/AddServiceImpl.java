package net.f3322.wry333.service;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.bean.Book;
import net.f3322.wry333.dao.AddDao;
import net.f3322.wry333.dao.AddDaoImpl;

public class AddServiceImpl implements AddService{
    private AddDao ad = new AddDaoImpl();
    @Override
    public Boolean insert(Book add){return ad.insert(add);}

}
