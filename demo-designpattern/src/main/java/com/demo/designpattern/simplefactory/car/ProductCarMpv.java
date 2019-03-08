package com.demo.designpattern.simplefactory.car;

/**
 * MPV
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:38
 */
public class ProductCarMpv implements IProductCar {
    @Override
    public void ignition() {
        System.out.println("I'm MPV ignition");
    }

    @Override
    public void startup() {
        System.out.println("I'm MPV startup");
    }
}
