package com.demo.designpattern.product;

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
    public ISUV createSUV() {
        return new SuperSuv();
    }
}
