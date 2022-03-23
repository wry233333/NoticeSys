package net.f3322.wry333.dao;

import net.f3322.wry333.utils.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import net.f3322.wry333.bean.Book;
public class DeleteDaoImpl implements DeleteDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public void delete(int b_id) {
        String sql = "DELETE FROM book WHERE b_id=?";
        jdbcTemplate.update(sql, b_id);

    }
}