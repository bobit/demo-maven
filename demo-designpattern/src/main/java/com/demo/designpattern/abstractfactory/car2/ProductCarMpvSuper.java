package com.demo.designpattern.abstractfactory.car2;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/8 16:55
 */
public class ProductCarMpvSuper implements AbstractProductCarMpv {
    @Override
    public void produceMpv() {
        System.out.println("Im ProductCarMpvSuper!");
    }
}
