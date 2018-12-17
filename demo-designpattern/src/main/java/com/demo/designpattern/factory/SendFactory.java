package com.demo.designpattern.factory;

/**
 * 工厂模式
 *
 * @Author: zhangb
 * @Date: 2018/12/13 23:12
 */
public class SendFactory {

    public Sender produce(String type) {
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
