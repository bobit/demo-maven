package com.demo.designpattern.abstractfactory.car2;

/**
 * 抽象工厂角色
 *
 * @Author: zhangb
 * @Date: 2019/3/8 16:53
 */
public interface AbstractFactory {
    public AbstractProductCarMpv createAbstractProductCarMpv();

    public AbstractProductCarSuv createAbstractProductCarSuv();

}
