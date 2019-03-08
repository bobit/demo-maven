package com.demo.designpattern.simplefactory.sender;

/**
 * 简单工厂模式
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 *
 * @Author: zhangb
 * @Date: 2018/12/13 23:12
 */
public class SendFactory {

    public ISender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
