package com.demo.designpattern.simplefactory.sender;

/**
 * 简单工厂模式Demo
 *
 * @Author: zhangb
 * @Date: 2018/12/13 23:13
 */
public class SendFactoryClient {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        ISender sender = factory.produce("sms");
        sender.Send();
    }
}
