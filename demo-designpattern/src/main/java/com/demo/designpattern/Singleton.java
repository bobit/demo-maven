package com.demo.designpattern;

/**
 * 单例模式（Singleton Pattern）
 * 通用代码,线程安全实例
 * @Author: zhangb
 * @Date: 2018/12/13 23:02
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();
    //限制产生多个对象
    private Singleton(){
    }
    //通过该方法获得实例对象
    public static Singleton getSingleton(){
        return singleton;
    }
    //类中其他方法，尽量是static
    public static void doSomething(){
    }
}
