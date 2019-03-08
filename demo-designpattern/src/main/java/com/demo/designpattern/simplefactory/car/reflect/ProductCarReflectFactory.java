package com.demo.designpattern.simplefactory.car.reflect;

import com.demo.designpattern.simplefactory.car.IProductCar;
import com.demo.designpattern.simplefactory.car.ProductCarMpv;
import com.demo.designpattern.simplefactory.car.ProductCarSuv;

/**
 * 简单工厂模式
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:57
 */
public class ProductCarReflectFactory {
    public IProductCar produce(Class<? extends IProductCar> c) throws Exception {
        return (IProductCar) Class.forName(c.getName()).newInstance();
//        return (IProductCar)c.newInstance();        //或者采用这种方法
    }
}