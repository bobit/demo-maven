package com.demo.designpattern.decorator;

/**
 * 客户端测试
 * Decorator模式相比生成子类更为灵活
 *
 * @Author: zhangb
 * @Date: 2019/3/8 15:47
 */
public class MessageBoardClient {
    public static void main(String[] args) {
        MessageBoardHandler mb = new MessageBoard();
        String content = mb.filter("一定要学好装饰模式！");
        System.out.println(content);
    }
}
