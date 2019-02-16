package com.demo.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 创建一个定长线程池，支持定时及周期性任务执行。
 *
 * @Author: zhangb
 * @Date: 2018/2/16 14:59
 */
public class ScheduledThreadPoolTests {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //定时
//		scheduledThreadPool.schedule(new Runnable() {
//		    @Override
//		    public void run() {
//				SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		        System.out.println("thread:" + Thread.currentThread().getName() + ",time:" + sdf1.format(new Date()));
//		    }
//		}, 3, TimeUnit.SECONDS);

        //循环周期执行
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 1 seconds, and excute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);

    }

}
