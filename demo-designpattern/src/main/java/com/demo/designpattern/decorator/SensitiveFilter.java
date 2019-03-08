package com.demo.designpattern.decorator;

/**
 * 具体装饰角色，增加过滤掉政治敏感字眼的功能
 *
 * @Author: zhangb
 * @Date: 2019/3/8 15:52
 */
public class SensitiveFilter extends MessageBoardDecorator {
    public SensitiveFilter(MessageBoardHandler handler) {
        super(handler);
    }

    @Override
    public String filter(String content) {
        String temp = super.filter(content);
        temp += "^^过滤掉政治敏感的字眼!^^";
        return temp;
    }
}