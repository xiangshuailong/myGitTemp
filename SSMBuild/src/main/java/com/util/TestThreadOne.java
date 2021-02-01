package com.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @ClassName TestThreadOne
 * @Description
 * @Author xiangshuailong
 * @Date 2021/1/19 16:29
 * @Version 1.0
 **/
public class TestThreadOne implements Runnable {

    private String url;
    private String name;

    public TestThreadOne(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downLoader(url,name);
    }

    public static void main(String[] args) {
        TestThreadOne t1 = new TestThreadOne("https://imagepphcloud.thepaper.cn/pph/image/109/532/295.jpg","D:\\11\\1.jpg");
        TestThreadOne t2 = new TestThreadOne("https://imagepphcloud.thepaper.cn/pph/image/109/532/281.jpg","D:\\11\\2.jpg");
        TestThreadOne t3 = new TestThreadOne("https://imagepphcloud.thepaper.cn/pph/image/109/532/285.jpg","D:\\11\\3.jpg");
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}
/**
* @Description: 下载网络图片到本地
* @Param:
* @return:
* @Author: xiangshuailong
* @Date: 2021/1/19
*/
class WebDownLoader{
    //下载方法
    public void downLoader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
            System.out.println("下载文件"+name+"成功");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件下载失败，Io有问题");//文件下载失败
        }
    }
}