package com.controller;


import com.pojo.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName Login
 * @Description
 * @Author xiangshuailong
 * @Date 2020/12/15 9:39
 * @Version 1.0
 **/
@Controller
@RequestMapping("/login")
public class Logining {

    @RequestMapping("/goLogin")
    public String goLogin(){
        return "goLogin";
    }

    @RequestMapping("/goHome")
    public String goHome(){
        return "home";
    }

    @RequestMapping("/loginCheck")
    public String login(HttpServletRequest request, String pass, String name){
        System.out.println("-------用户名："+name + "  密码："+pass);
        HttpSession session = request.getSession();
        //session写入数据拦截器判断并通行
        session.setAttribute("loginSuccess","success");
        return "home";
    }

}
