package com.util;

import java.util.*;

/**
 * @ClassName TestBasics
 * @Description
 * @Author xiangshuailong
 * @Date 2021/1/22 10:24
 * @Version 1.0
 **/
public class TestBasics {

    public static void main(String[] args) {
//       System.out.println(Objects.equals(null,""));
        TestBasics testBasics = new TestBasics();
        //testBasics.basics();  //数组对象转集合


    }

    /**
    * @Description: 数组对象转集合
    * @Author: xiangshuailong
    * @Date: 2021/1/22
    */
    public void basics(){
        List myList = Arrays.asList("Apple","Banana", "Orange");
        System.out.println("String对象长度====" + myList.size());

        int[] ints = {1,2,3};
        List intsList = Arrays.asList(ints);
        System.out.println("基本数据类型int长度=====" + intsList.size());

        Integer[] integers = {1,2,3};
        List integersList = Arrays.asList(integers);
        System.out.println("包装数据类型Integer长度=====" + integersList.size());
        /**
         *
         * Arrays.asList() 方法返回的并不是 java.util.ArrayList ，而是 java.util.Arrays 的一个内部类,
         * 这个内部类并没有实现集合的修改方法或者说并没有重写这些方法(不能使用add(),remove()等方法),
         * 使用下面方法才能将数组对象转化为list集合
         */
        int [] i = {1,2,30};
        List list = new ArrayList(Arrays.asList(i));
        list.add(2);
        System.out.println(list.size());
    }
}
