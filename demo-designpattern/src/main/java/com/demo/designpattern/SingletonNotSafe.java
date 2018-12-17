package com.demo.designpattern;

/**
 * 单例模式（Singleton Pattern）
 * 线程不安全实例
 * @Author: zhangb
 * @Date: 2018/12/13 23:02
 */
public class SingletonNotSafe {

    private static SingletonNotSafe singleton = null;
    //限制产生多个对象
    private SingletonNotSafe(){
    }
    //通过该方法获得实例对象
    public static SingletonNotSafe getSingleton(){
        if(singleton == null){
            singleton = new SingletonNotSafe();
        }
        return singleton;
    }
}
