package com.demo.designpattern.abstractfactory.car2;

/**
 * 具体产品角色 中配
 *
 * @Author: zhangb
 * @Date: 2019/3/8 16:54
 */
public class ProductCarSuvMed implements AbstractProductCarSuv {
    @Override
    public void produceSuv() {
        System.out.println("Im ProductCarSuvMed!");
    }
}
