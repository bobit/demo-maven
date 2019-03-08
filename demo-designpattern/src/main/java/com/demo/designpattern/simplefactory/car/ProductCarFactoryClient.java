package com.demo.designpattern.simplefactory.car;

/**
 * 简单工厂模式-客户端测试
 *
 * @Author: zhangb
 * @Date: 2019/3/7 17:04
 */
public class ProductCarFactoryClient {

    public static void main(String args[]) {
        ProductCarFactory factory = new ProductCarFactory();
//        IProductCar suv = factory.produce("suv");
        IProductCar suv = factory.produce("mpv");
        suv.startup();
    }
}
