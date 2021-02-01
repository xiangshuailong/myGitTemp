package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description
 * @Author xiangshuailong
 * @Date 2020/12/4 14:51
 * @Version 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/update")
    public String updateUser(Model model){
        User user = new User(1,"xiang",22,"哦");
        int i = userService.updateUser(user);
        model.addAttribute("list",i);
        return "user";
    }
    @ResponseBody
    @RequestMapping("/select")
    public Map select(){
        List<User> userList = userService.selectUser();
        Map hashMap = new HashMap();
        hashMap.put("userList",userList);
        return hashMap;
    }

    @ResponseBody
    @RequestMapping(value = "/selectTwo",method = RequestMethod.POST)
    public Map selectList(){
        List<User> userList = userService.selectUserList();
        Map hashMap = new HashMap();
        hashMap.put("userList",userList);
        return hashMap;
    }


}
