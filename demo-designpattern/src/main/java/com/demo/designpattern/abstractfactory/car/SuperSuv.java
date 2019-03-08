package com.demo.designpattern.abstractfactory.car;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:38
 */
public class SuperSuv extends ISuv {
    @Override
    public void ignition() {
        System.out.println("高级SUV点火");
    }

    @Override
    public void startup() {
        System.out.println("高级SUV启动");
    }
}
