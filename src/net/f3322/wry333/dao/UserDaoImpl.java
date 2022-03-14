package net.f3322.wry333.dao;

import net.f3322.wry333.bean.User;
import net.f3322.wry333.utils.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao{
    private  JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public User find(User user) {
        String sql ="SELECT * FROM user WHERE username = ? and password = ?";
        User user_succ = null;
        try {
            user_succ = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), user.getUsername(), user.getPassword());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return user_succ;
    }

    @Override
    public Boolean insert(User user) {
        String sql = "INSERT INTO user VALUES (null,?,?,?,?)";
        int update = 0;
        try {
            update = jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getGender(), user.getEmail());
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


    @Override
    public User findByEmail(User user) {
        String sql ="SELECT * FROM user WHERE email = ?";
        User user_succ = null;
        try {
            user_succ = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),user.getEmail());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return user_succ;
    }

    @Override
    public boolean resetPwd(User t_use,String pwd) {
        String sql = "update user set password = ? where id= ?";
        try {
            int i = jdbcTemplate.update(sql, pwd, t_use.getId());
            if (i!=0){
                return true;
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
