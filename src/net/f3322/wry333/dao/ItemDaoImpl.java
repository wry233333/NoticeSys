package net.f3322.wry333.dao;

import net.f3322.wry333.bean.Item;
import net.f3322.wry333.utils.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ItemDaoImpl implements ItemDao{
    private JdbcTemplate jdbcTemplate =new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Item> findListByID(String id) {
        String sql = "SELECT  l_id,b.name as b_name,return_date,borrow_date,rel_date FROM list a, book b  WHERE a.b_id =b.b_id AND a.id = ?";
        List<Item> list = null;
        try {
            list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Item>(Item.class),id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return list;
    }
}
