package com.service;

import com.pojo.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description
 * @Author xiangshuailong
 * @Date 2020/12/4 10:04
 * @Version 1.0
 **/
public interface UserService {

    //查询
    int updateUser(User user);

    //插入
    int insertBooks(User user);

    //查询
    List<User> selectUser();
    List<User> selectUserList();
}
