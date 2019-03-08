package com.demo.designpattern.factorymethod;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/8 16:36
 */
public class ProductCarSuvFactory implements IFactory {
    @Override
    public IProductCar produce() {
        return new ProductCarSuv();
    }
}
