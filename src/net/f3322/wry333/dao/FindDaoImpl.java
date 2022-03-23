package net.f3322.wry333.dao;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.bean.BookClasses;
import net.f3322.wry333.utils.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class FindDaoImpl implements FindDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Book> findallbook(){
        List<Book> list = null;
        String sql ="SELECT * FROM book";
        try{
            list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        } catch (DataAccessException e){
            e.printStackTrace();
            return null;
        }
        return list;
    }

}
