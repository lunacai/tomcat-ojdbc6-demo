package com.example.ojdbctomcatdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.sql.*;
import java.util.List;

@SpringBootTest
class OjdbcTomcatDemoApplicationTests {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {

//        String querySQL = "insert into \"canace\".\"T_USER\"(ID,USERID,LOGINPASSWORD,ISDISABLE) VALUES(?,?,?,?)";
//        jdbcTemplate.update(querySQL,1,"name","dsdc",212);

        String querySQL = "update \"canace\".\"T_USER\" set USERID = ? where ID = ?";
//        jdbcTemplate.update(querySQL, "na22222me", 1);


        querySQL = "SELECT * FROM \"canace\".\"users\"";
        List vo = jdbcTemplate.queryForList(querySQL);
        System.out.println(">>>>>>>>>" + vo.toString());


    }
}
