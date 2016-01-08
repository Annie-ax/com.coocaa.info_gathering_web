package com.coocaa.anniecode.service;

import com.coocaa.anniecode.pojo.User;

import java.util.List;

/**
 * Created by keaxiang on 2015/12/29.
 */
public interface UserService {

    List<User> findAll();

    User selectByPrimaryKey();

}
