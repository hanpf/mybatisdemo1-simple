package com.hpf.study.mybatisstudy.dao;

import com.hpf.study.mybatisstudy.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

        List<User> queryUserByName(String name);

}
