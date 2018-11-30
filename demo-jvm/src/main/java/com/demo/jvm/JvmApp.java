package com.demo.jvm;

/**
 * jvm
 *
 * @Author: zhangb
 * @Date: 2016/11/30 20:51
 */
public class JvmApp {

    private static int count = 0;

    public static void main(String[] args) {
        JvmApp test = new JvmApp();
        test.test();
    }

    /**
     * 递归调用
     */
    private void test() {
        try {
            count++;
            test();
        } catch (Throwable e) {
            System.out.println("递归调用次数" + count);
            e.printStackTrace();
            //Exception已经捕获不了JVM抛出的StackOverflowError
            //java.lang.StackOverflowError
            //	at sun.misc.Unsafe.compareAndSwapLong(Native Method)
            //	at java.util.concurrent.ConcurrentHashMap.addCount(ConcurrentHashMap.java:2259)
            //	at java.util.concurrent.ConcurrentHashMap.putVal(ConcurrentHashMap.java:1070)
            //	at java.util.concurrent.ConcurrentHashMap.putIfAbsent(ConcurrentHashMap.java:1535)
            //	at java.lang.ClassLoader.getClassLoadingLock(ClassLoader.java:463)
            //	at java.lang.ClassLoader.loadClass(ClassLoader.java:404)
            //	at java.lang.ClassLoader.loadClass(ClassLoader.java:411)
            //	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:335)
            //	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
        }
    }
}