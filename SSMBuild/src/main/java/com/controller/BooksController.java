package com.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName BooksController
 * @Description
 * @Author xiangshuailong
 * @Date 2020/12/7 10:49
 * @Version 1.0
 **/
@Controller
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private UserService userService;
    @RequestMapping("/insertUser")
    public String insertBooks(Model model){
        User user = new User(2,"罗",20,"哦");
        int i = userService.insertBooks(user);
        model.addAttribute("list",i);
        return "user";
    }

}
