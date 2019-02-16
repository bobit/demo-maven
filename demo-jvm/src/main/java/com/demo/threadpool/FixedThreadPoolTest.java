package com.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 *
 * @Author: zhangb
 * @Date: 2018/2/16 13:56
 */
public class FixedThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 50; i++) {
            fixedThreadPool.submit(new TestThread((i + 1)));
        }
        fixedThreadPool.shutdown();
    }

}
