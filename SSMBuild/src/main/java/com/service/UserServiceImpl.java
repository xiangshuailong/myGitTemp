package com.service;

import com.dao.BooksDao;
import com.dao.UserDao;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author xiangshuailong
 * @Date 2020/12/4 10:04
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private BooksDao booksDao;

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public int insertBooks(User user) {
        return booksDao.insertUser(user);
    }

    public List<User> selectUser() {
        return userDao.selectUser();
    }

    public List<User> selectUserList() {
        List list = new ArrayList();
        User user1 = new User();
        user1.setAge(21);
        User use2 = new User();
        use2.setAge(22);
        list.add(user1);
        list.add(use2);
        List<User> userList = userDao.selectUserList(list);
        return userList;
    }
}
