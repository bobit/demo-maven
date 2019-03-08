package com.demo.designpattern.abstractfactory.car2;

/**
 * 具体工厂角色 Med
 *
 * @Author: zhangb
 * @Date: 2019/3/8 16:58
 */
public class ProductCarMedFactory implements AbstractFactory {

    @Override
    public AbstractProductCarMpv createAbstractProductCarMpv() {
        return new ProductCarMpvMed();
    }

    @Override
    public AbstractProductCarSuv createAbstractProductCarSuv() {
        return new ProductCarSuvMed();
    }
}
