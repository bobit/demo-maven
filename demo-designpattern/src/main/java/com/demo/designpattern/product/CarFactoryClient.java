package com.demo.designpattern.product;

/**
 * 简单工厂模式
 *
 * @Author: zhangb
 * @Date: 2019/3/7 17:04
 */
public class CarFactoryClient {

    public static void main(String args[]) {
        CarFactory carSuvFactory = new CarFactory();
        ISUV suv = carSuvFactory.produce("super");
//        ISUV suv = carSuvFactory.produce("med");
        suv.startup();
    }
}
