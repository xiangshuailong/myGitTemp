package com.dao;

import com.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserDao
 * @Description
 * @Author xiangshuailong
 * @Date 2020/12/3 9:52
 * @Version 1.0
 **/
public interface UserDao {

    //更新
    int updateUser(User user);
    //查询
    List<User> selectUser();

    /**
    * @Description: List多值查询
    * @Param: [list]
    * @return: java.util.List<com.pojo.User>
    * @Author: xiangshuailong
    * @Date: 2021/1/12
    */
    List<User> selectUserList(List list);

    /**
    * @Description: 数组多值查询
    * @Param: [list]
    * @return: java.util.List<com.pojo.User>
    * @Author: xiangshuailong
    * @Date: 2021/1/12
    */
    List<User> selectUserArray(int[] list);
}
