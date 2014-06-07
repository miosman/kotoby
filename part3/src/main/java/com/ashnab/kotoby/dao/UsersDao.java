package com.ashnab.kotoby.dao;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by Mohamed on 5/31/2014
 */
@Repository
public class UsersDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UsersDao(DataSource dataSource)
    {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createUser(String username)
    {
        jdbcTemplate.update("INSERT into users(username,password,enabled) values(?,?,true)",username, RandomStringUtils.randomAlphanumeric(8));
        jdbcTemplate.update("INSERT into authorities(username,authority) values(?,?)",username,"USER");
    }
}
