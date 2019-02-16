package com.demo.threadpool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个可缓存的线程池。如果线程池的大小超过了处理任务所需要的线程，那么就会回收部分空闲（60秒不执行任务）的线程，当任务数增加时，此线程池又可以智能的添加新线程来处理任务。此线程池不会对线程池大小做限制，线程池大小完全依赖于操作系统（或者说JVM）能够创建的最大线程大小。
 *
 * @Author: zhangb
 * @Date: 2018/2/16 13:37
 */
@Slf4j
public class CachedThreadPoolTests {

    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 50; i++) {
            cachedThreadPool.submit(new TestThread((i + 1)));
        }
        cachedThreadPool.shutdown();
    }

}
