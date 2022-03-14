package net.f3322.wry333.service;

import net.f3322.wry333.bean.BookClasses;
import net.f3322.wry333.bean.Book;

import java.util.List;

public interface BookService {
    List<Book> search(String bookClasses);

    List<BookClasses> bookClasses();

    Book find(String b_id);
}
