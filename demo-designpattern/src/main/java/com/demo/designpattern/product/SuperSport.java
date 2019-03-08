package com.demo.designpattern.product;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:38
 */
public class SuperSport extends ISport {
    @Override
    public void ignition() {
        System.out.println("高级运动车点火");
    }

    @Override
    public void startup() {
        System.out.println("高级运动车启动");
    }
}
