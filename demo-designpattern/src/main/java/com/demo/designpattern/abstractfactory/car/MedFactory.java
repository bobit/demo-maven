package com.demo.designpattern.abstractfactory.car;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:38
 */
public class MedFactory implements ICar {
    @Override
    public ISport createSport() {
        return new MedSport();
    }

    @Override
    public ISuv createSUV() {
        return new MedSuv();
    }
}