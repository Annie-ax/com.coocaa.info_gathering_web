package com.coocaa.anniecode.service;

import com.coocaa.anniecode.mapper.UserMapper;
import com.coocaa.anniecode.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by keaxiang on 2015/12/29.
 */
@Service

public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.selectByExample(null);
    }

    public User selectByPrimaryKey() {
        return userMapper.selectByPrimaryKey(1L);
    }
}
