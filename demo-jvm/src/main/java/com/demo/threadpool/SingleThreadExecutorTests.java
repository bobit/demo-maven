package com.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
 *
 * @Author: zhangb
 * @Date: 2018/2/16 14:59
 */
public class SingleThreadExecutorTests {
    public static void main(String[] args) {
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 50; i++) {
            singleThreadPool.submit(new TestThread((i + 1)));
        }
        singleThreadPool.shutdown();
    }

}
