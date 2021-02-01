package com.util;


/**
 * @ClassName TestThread
 * @Description
 * @Author xiangshuailong
 * @Date 2021/1/18 16:04
 * @Version 1.0
 **/
public class TestThread extends Thread{

    private static int product=0, MAX_PRODUCT =100,MIN_PRODUCT=0;


    public static void main(String [] args){
        TestThread testThread = new TestThread();
        testThread.start();
        /*for (int i=0;i<100;i++){
            if (product>MIN_PRODUCT){
                System.out.println("主线程执行了product======"+product);
                product--;
            }
        }*/
        for (int i = product;i<MAX_PRODUCT;i ++){
            System.out.println("主线程执行了product======"+product);
            product--;
        }
    }

    /**
     * 生产者生产出来的产品交给店员
     */
    public synchronized void produce()
    {
        if(this.product >= MAX_PRODUCT)
        {
            try
            {
                System.out.println("产品已满,请稍候再生产");
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            return;
        }

        this.product++;
        System.out.println("生产者生产第" + this.product + "个产品.");
        notifyAll();   //通知等待区的消费者可以取出产品了
    }

    /**
     * 消费者从店员取产品
     */
    public synchronized void consume()
    {
        if(this.product <= MIN_PRODUCT)
        {
            try
            {
                System.out.println("缺货,稍候再取");
                wait();

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            return;
        }

        System.out.println("消费者取走了第" + this.product + "个产品.");
        this.product--;
        notifyAll();   //通知等待去的生产者可以生产产品了
    }

    @Override
    public  void run() {
        /*for (int i=0;i<100;i++){
            if (product < MAX_PRODUCT){
                System.out.println("子线程执行了product======="+product);
                product++;
            }
        }*/
        for (int i=product;i<MAX_PRODUCT;i ++){
            System.out.println("子线程执行了product======"+product);
            product++;
        }

    }
}
