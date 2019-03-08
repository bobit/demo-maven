package com.demo.designpattern.abstractfactory.car;

/**
 * 对两款车型分别提供高级和中级配置
 * 产品类图？
 * 应用抽象工厂模式完成代码
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:36
 */
public interface ICar {
    public ISport createSport();

    public ISuv createSUV();
}
