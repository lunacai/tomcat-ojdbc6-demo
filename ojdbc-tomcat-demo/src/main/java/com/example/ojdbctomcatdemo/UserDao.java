package com.example.ojdbctomcatdemo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List findByName() {
        String querySQL = "SELECT * FROM \"canace\".\"T_USER\"";
        List vo = jdbcTemplate.queryForList(querySQL);
        return vo;
    }

    public String addUser(UserModel userModel) {
        String querySQL = "insert into \"canace\".\"T_USER\"(ID,USERID,LOGINPASSWORD,ISDISABLE) VALUES(?,?,?,?)";
        jdbcTemplate.update(querySQL,userModel.getID(),userModel.getUSERID(),userModel.getLOGINPASSWORD(),userModel.getISDISABLE());
        return "success";
    }

    public String updateUser(UserModel userModel) {
        String querySQL = "update \"canace\".\"T_USER\" set USERID = ? where ID = ?";
        jdbcTemplate.update(querySQL,userModel.getUSERID(),userModel.getID());
        return "success";
    }
}
