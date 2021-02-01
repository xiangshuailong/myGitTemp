package com.xiang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xiang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloJSON
 * @Description
 * @Author xiangshuailong
 * @Date 2020/12/1 16:58
 * @Version 1.0
 **/
@Controller
@RequestMapping
public class HelloJSON {

    @RequestMapping("/j1")
    @ResponseBody //不走视图解析器
    public String json1(){

        JSONArray jsonArray = new JSONArray();
        User user = new User(1,"向帅龙",18);
//        JSON json = (JSON) JSON.toJSON(user);
        JSONObject jsonObject = (JSONObject) JSON.toJSON(user);
        return jsonObject.getString("name");
    }

}
