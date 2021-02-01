package com.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName LoginInterceptor
 * @Description
 * @Author xiangshuailong
 * @Date 2020/12/15 9:36
 * @Version 1.0
 **/
public class LoginInterceptor implements HandlerInterceptor
{
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("=========拦截器=====");
        HttpSession session = httpServletRequest.getSession();
        if (httpServletRequest.getRequestURI().contains("loginCheck")){
            return true;
        }
        if (session.getAttribute("loginSuccess") != null){
            return true;
        }
        //转发
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(httpServletRequest,httpServletResponse);
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
