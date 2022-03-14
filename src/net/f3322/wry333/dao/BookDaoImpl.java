package net.f3322.wry333.dao;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.bean.BookClasses;
import net.f3322.wry333.utils.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BookDaoImpl implements BookDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<Book> search(String bookClasses) {
        List<Book> list = null;
        String sql = "SELECT * FROM book WHERE c_id = ?";
        try {
            list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class),bookClasses);
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
        return list;
    }

    @Override
    public List<BookClasses> bookClasses() {
        List<BookClasses> list = null;
        String sql = "SELECT * FROM bookclasses ";
        try {
           list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<BookClasses>(BookClasses.class));
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
        return list;
    }

    @Override
    public Book find(String b_id) {
        Book book = new Book();
        String sql = "SELECT * FROM book WHERE b_id = ?";
        try {
            book = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),b_id);
        } catch (DataAccessException e) {

            e.printStackTrace();
            return null;
        }
        return book;
    }
}
