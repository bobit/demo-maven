package com.demo.designpattern.factorymethod;

/**
 * 客户端测试
 *
 * @Author: zhangb
 * @Date: 2019/3/8 16:39
 */
public class FactoryMethodClient {
    public static void main(String args[]) {
        IFactory iFactory = new ProductCarMpvFactory();
        IProductCar iProductCar = iFactory.produce();
        iProductCar.startup();
    }
}
