package com.demo.designpattern.factory;

/**
 * 工厂模式
 *
 * @Author: zhangb
 * @Date: 2018/12/13 23:12
 */
public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}