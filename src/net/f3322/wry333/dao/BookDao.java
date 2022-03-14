package net.f3322.wry333.dao;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.bean.BookClasses;

import java.util.List;

public interface BookDao {
    List<Book> search(String bookClasses);

    List<BookClasses> bookClasses();

    Book find(String b_id);
}
