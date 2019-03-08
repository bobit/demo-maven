package com.demo.designpattern.product;

import com.demo.designpattern.factory.SmsSender;

/**
 * 简单工厂模式
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:57
 */
public class CarFactory {
    public ISUV produce(String type) {
        if ("super".equals(type)) {
            return new SuperSuv();
        } else if ("med".equals(type)) {
            return new MedSuv();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
