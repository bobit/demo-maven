package com.demo.threadpool;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 创建线程
 *
 * @Author: zhangb
 * @Date: 2018/2/16 13:36
 */
@Slf4j//使用lombok
public class TestThread implements Runnable {

//    private final Logger logger = LoggerFactory.getLogger(TestThread.class);


    /**
     * 线程私有属性，创建线程时创建
     */
    private Integer num = 0;

    public TestThread(Integer num) {
        this.num = num;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("thread:" + Thread.currentThread().getName() + ",time:" + sdf1.format(new Date()) + ",num:" + num);
        //使用了lombok之后直接用于log对日志进行打印
        log.info("thread:" + Thread.currentThread().getName() + ",time:" + sdf1.format(new Date()) + ",num:" + num);
        try {
            //使线程睡眠，模拟线程阻塞情况
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
