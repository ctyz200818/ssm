package com.feiben.mybatis.mapper;

import java.util.List;

import com.feiben.mybatis.entity.User;

public interface UserMapper {
    List<User> queryUserList();
}
