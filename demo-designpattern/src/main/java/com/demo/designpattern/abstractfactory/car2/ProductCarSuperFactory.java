package com.demo.designpattern.abstractfactory.car2;

/**
 * 具体工厂角色 super
 *
 * @Author: zhangb
 * @Date: 2019/3/8 16:56
 */
public class ProductCarSuperFactory implements AbstractFactory {
    @Override
    public AbstractProductCarMpv createAbstractProductCarMpv() {
        return new ProductCarMpvSuper();
    }

    @Override
    public AbstractProductCarSuv createAbstractProductCarSuv() {
        return new ProductCarSuvSuper();
    }
}
