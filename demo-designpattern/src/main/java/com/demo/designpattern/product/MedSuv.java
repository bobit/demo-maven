package com.demo.designpattern.product;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:39
 */
public class MedSuv extends ISUV {
    @Override
    public void ignition() {
        System.out.println("中级SUV点火");
    }

    @Override
    public void startup() {
        System.out.println("中级SUV启动");
    }
}
