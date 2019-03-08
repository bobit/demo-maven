package com.demo.designpattern.abstractfactory.car;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:37
 */
public class SuperFactory implements ICar {

    @Override
    public ISport createSport() {
        return new SuperSport();
    }

    @Override
    public ISuv createSUV() {
        return new SuperSuv();
    }
}
