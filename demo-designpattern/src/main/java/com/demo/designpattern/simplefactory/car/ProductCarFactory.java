package com.demo.designpattern.simplefactory.car;

/**
 * 简单工厂模式
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:57
 */
public class ProductCarFactory {
    public IProductCar produce(String type) {
        if ("mpv".equals(type)) {
            return new ProductCarMpv();
        } else if ("suv".equals(type)) {
            return new ProductCarSuv();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
