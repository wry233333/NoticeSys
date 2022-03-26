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


    @Override
    public Item findByL_id(String l_id) {
        String sql = "SELECT * FROM list WHERE l_id = ?";
        Item item = null;
        try {
            item = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Item>(Item.class), l_id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return item;
    }


    @Override
    public boolean adjReturn_date(String l_id, String backTime) {
        String sql = "UPDATE list SET return_date = ? WHERE l_id = ?";
        try {
            int update = jdbcTemplate.update(sql, backTime, l_id);
            if (update != 0){
                return true;
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }


    @Override
    public boolean addItem(Item item) {
        String sql = "insert into list values (null,?,?,?,?,null)";
        try {
            int update = jdbcTemplate.update(sql, item.getId(), item.getB_id(), item.getReturn_date(), item.getBorrow_date());
            if( update != 0){
                return true;
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }


    public List<Item> findAll() {
        //使用JDBC操作数据库...
        //1.定义sql
        String sql ="SELECT * FROM list";
        List<Item> items = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Item>(Item.class));

        return items;
    }

    @Override
    public void add(Item item) {
        //1.定义sql
        String sql ="insert into list values(null,?,?,?,?,?)";
        //2.执行sql
        jdbcTemplate.update(sql,item.getL_id(),item.getId(),item.getB_id(),item.getReturn_date(),item.getBorrow_date(),item.getRel_date());

    }

    @Override
    public void delete(String l_id) {
        //定义sql
        String sql = "delete from list where l_id = ?";
        //2.执行sql
        jdbcTemplate.update(sql, l_id);

    }

}
