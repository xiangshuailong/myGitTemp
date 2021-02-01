package com.xiang;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName HelloController
 * @Description
 * @Author xiangshuailong
 * @Date 2020/11/19 14:48
 * @Version 1.0
 **/
public class HelloController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前端参数
        String method = req.getParameter("method");
        if (method.equals("add")){
            req.getSession().setAttribute("msg","执行了add方法");
        }else if (method.equals("delete")){
            req.getSession().setAttribute("msg","执行了delete方法");
        }else {
            req.getSession().setAttribute("msg","未输入");
        }
        //调用业务层
        //视图转发或重定向
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
