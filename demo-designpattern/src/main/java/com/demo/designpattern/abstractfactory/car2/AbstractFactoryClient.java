package com.demo.designpattern.abstractfactory.car2;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/8 16:59
 */
public class AbstractFactoryClient {
    public static void main(String args[]) {

        AbstractFactory factory = new ProductCarMedFactory();
        AbstractProductCarSuv productCarSuv = factory.createAbstractProductCarSuv();
        AbstractProductCarMpv productCarMpv = factory.createAbstractProductCarMpv();
        productCarSuv.produceB();
        productCarMpv.produceA();
    }
}
