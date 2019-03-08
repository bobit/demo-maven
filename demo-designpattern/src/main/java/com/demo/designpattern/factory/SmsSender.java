package com.demo.designpattern.factory;

/**
 * sms
 *
 * @Author: zhangb
 * @Date: 2018/12/13 23:12
 */
public class SmsSender implements ISender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}