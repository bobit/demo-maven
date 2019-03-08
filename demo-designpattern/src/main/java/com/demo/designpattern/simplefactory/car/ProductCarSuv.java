package com.demo.designpattern.simplefactory.car;

/**
 * SUV
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:39
 */
public class ProductCarSuv implements IProductCar {
    @Override
    public void ignition() {
        System.out.println("I'm SUV ignition");
    }

    @Override
    public void startup() {
        System.out.println("I'm SUV startup");
    }
}
