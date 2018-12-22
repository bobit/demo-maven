package com.demo.lombok;

import lombok.Synchronized;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2017/12/19 23:37
 */
public class SynchronizedExample4Lombok {
    private final Object readLock = new Object();

    @Synchronized
    public static void hello() {
        System.out.println("world");
    }

    @Synchronized
    public int answerToLife() {
        return 42;
    }

    @Synchronized("readLock")
    public void foo() {
        System.out.println("bar");
    }
}
