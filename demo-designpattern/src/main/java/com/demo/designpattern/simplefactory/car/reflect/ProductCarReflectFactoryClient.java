package com.demo.designpattern.simplefactory.car.reflect;

import com.demo.designpattern.simplefactory.car.IProductCar;
import com.demo.designpattern.simplefactory.car.ProductCarFactory;
import com.demo.designpattern.simplefactory.car.ProductCarMpv;
import com.demo.designpattern.simplefactory.car.ProductCarSuv;

/**
 * 接口优先于反射机制
 * 简单工厂模式
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:57
 */
public class ProductCarReflectFactoryClient {
    public static void main(String args[]) throws Exception {
        ProductCarReflectFactory factory = new ProductCarReflectFactory();
        IProductCar suv = factory.produce(ProductCarSuv.class);
        suv.startup();
    }
}
