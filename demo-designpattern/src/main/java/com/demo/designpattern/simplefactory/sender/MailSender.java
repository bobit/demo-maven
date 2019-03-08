package com.demo.designpattern.simplefactory.sender;

/**
 * mail
 *
 * @Author: zhangb
 * @Date: 2018/12/13 23:12
 */
public class MailSender implements ISender {

    @Override
    public void Send() {
        System.out.println("this is mail sender!");
    }
}
