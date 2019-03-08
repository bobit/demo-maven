package com.demo.designpattern.factorymethod;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/8 16:35
 */
public class ProductCarMpvFactory implements IFactory {
    @Override
    public IProductCar produce() {
        return new ProductCarMpv();
    }
}
