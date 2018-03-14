package com.feiben.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feiben.mybatis.entity.EasyUIResult;
import com.feiben.mybatis.entity.User;
import com.feiben.mybatis.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
        public EasyUIResult queryUserList(Integer page, Integer rows) {
        //设置分布查询
        PageHelper.startPage(page, rows);
        List<User> users = this.userMapper.queryUserList();
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        return new EasyUIResult(pageInfo.getTotal(), pageInfo.getList());
    }
    }

