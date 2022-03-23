package net.f3322.wry333.service;

import net.f3322.wry333.dao.FindDao;
import net.f3322.wry333.dao.FindDaoImpl;
import net.f3322.wry333.bean.Book;
import java.util.List;

public class FindServiceImpl implements FindService {
    private FindDao findDao = new FindDaoImpl();
    @Override
    public List<Book> findallbook(){return findDao.findallbook();}
}
