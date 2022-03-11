package net.f3322.wry333.dao;

import net.f3322.wry333.bean.Notice;
import net.f3322.wry333.utils.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class NoticeDaoImpl implements NoticeDao{
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<Notice> search(String institute) {
        List<Notice> list = null;
        String sql = "SELECT * FROM notice WHERE institute = ?";
        try {
            list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Notice>(Notice.class),institute);
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
        return list;
    }
}
