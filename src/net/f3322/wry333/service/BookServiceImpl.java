package net.f3322.wry333.service;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.bean.BookClasses;
import net.f3322.wry333.dao.BookDao;
import net.f3322.wry333.dao.BookDaoImpl;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();
    @Override
    public List<Book> search(String bookClasses) {
        return bookDao.search(bookClasses);
    }

    @Override
    public List<BookClasses> bookClasses() {
        return bookDao.bookClasses();
    }

    @Override
    public Book find(String b_id) {
        return bookDao.find(b_id);
    }
}
