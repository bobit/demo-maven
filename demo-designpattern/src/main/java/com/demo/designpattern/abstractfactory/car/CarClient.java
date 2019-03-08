package com.demo.designpattern.abstractfactory.car;

/**
 * 抽象工厂模式：
 * <p>
 * 1、用UML绘制出三种工厂模式的类结构图。
 * <p>
 * 2、深刻理解产品族和产品等级结构之间的关系。
 * <p>
 * 3、自主完成三种工厂模式的代码实现，理解简单工厂、工厂方法和抽象工厂的区别。
 * <p>
 * 作业提交到评论区，未提交作业者不能参加《21天设计模式强化特训营》！
 *
 * @Author: zhangb
 * @Date: 2019/3/7 16:41
 */
public class CarClient {
    public static void main(String[] args) {
        SuperFactory sf = new SuperFactory();

        SuperSport sp = (SuperSport) sf.createSport();
        sp.ignition();
        sp.startup();

        SuperSuv ss = (SuperSuv) sf.createSUV();
        ss.ignition();
        ss.startup();

        MedFactory mf = new MedFactory();

        MedSport mSport = (MedSport) mf.createSport();
        mSport.ignition();
        mSport.startup();

        MedSuv mSuv = (MedSuv) mf.createSUV();
        mSuv.ignition();
        mSuv.startup();

    }
}
