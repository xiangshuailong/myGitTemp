package com.util;

/**
 * @ClassName Dd
 * @Description
 * @Author xiangshuailong
 * @Date 2021/1/29 10:47
 * @Version 1.0
 **/
public class Dd {

    public  int inc = 0;

    public  void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final Dd test = new Dd();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        }

        while(Thread.activeCount()>2)  //保证前面的线程都执行完  idea执行main方法时会启两个线程  还有一个Monitor Ctrl-Break 线程
            Thread.yield();
        System.out.println(test.inc);
    }

}
