package com.hpf.study.mybatisstudy.controller;


import com.hpf.study.mybatisstudy.dao.UserMapper;
import com.hpf.study.mybatisstudy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserInfoController {


    @Resource
    UserMapper userMapper;

    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    DataSourceProperties dataSourceProperties;

    @RequestMapping("index")
    public Object getUserInfoByName(){
        List<User> users = userMapper.queryUserByName(null);

        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getClass().getName());
        System.out.println(dataSourceProperties);
        return users;
    }
}
