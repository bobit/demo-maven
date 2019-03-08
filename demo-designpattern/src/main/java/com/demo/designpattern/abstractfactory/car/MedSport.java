package com.demo.designpattern.abstractfactory.car;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:39
 */
public class MedSport extends ISport {
    @Override
    public void ignition() {
        System.out.println("中级运动车点火");
    }

    @Override
    public void startup() {
        System.out.println("中级运动车启动");
    }
}
