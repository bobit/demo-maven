package com.demo.designpattern.product;

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
    public ISUV createSUV() {
        return new MedSuv();
    }
}