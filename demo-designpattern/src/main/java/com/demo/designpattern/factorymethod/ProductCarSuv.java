package com.demo.designpattern.factorymethod;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/8 16:37
 */
public class ProductCarSuv implements IProductCar {
    @Override
    public void startup() {
        System.out.println("I'm ProductCarMpvMed!");
    }
}
