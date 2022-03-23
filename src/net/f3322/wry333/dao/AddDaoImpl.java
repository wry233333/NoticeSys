package net.f3322.wry333.dao;

import net.f3322.wry333.bean.Book;
import net.f3322.wry333.utils.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class AddDaoImpl implements AddDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public Boolean insert(Book add) {
        String sql = "INSERT INTO book VALUES (null,?,?,?,?,?,?,?)";
        int update = 0;
        try {
            update = jdbcTemplate.update(sql, add.getName(), add.getPublisher(), add.getAuthor(),add.getDate(),add.getInfo(),add.getContext(),add.getC_id());
        } catch (DataAccessException e) {
            e.printStackTrace();
            return false;
        }
        if (update != 0){
            return true;
        }
        else {
            return false;
        }
    }
}

