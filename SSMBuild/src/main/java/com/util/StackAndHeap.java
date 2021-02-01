package com.util;

/**
 * @ClassName StackAndHeap
 * @Description
 * @Author xiangshuailong
 * @Date 2021/1/13 17:22
 * @Version 1.0
 **/
public class StackAndHeap {

    public static void main(String [] args){
        int a = 10;
        Persion persion = new Persion();
        persion.age=4;
        change(a,persion);
        System.out.println("a2:"+ a + "  persion.age2:" + persion.age);
    }

    public static void change(int a,Persion persion){
        a = 12;
        persion.age = 5;
        System.out.println("a:"+ a + "  persion.age:" + persion.age);
    }

}

