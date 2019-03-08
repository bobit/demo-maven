package com.demo.designpattern.decorator;

/**
 * 用户留言板的具体实现
 *
 * @Author: zhangb
 * @Date: 2019/3/8 15:45
 */
public class MessageBoard implements MessageBoardHandler {
    @Override
    public String filter(String msg) {
        return "留言板上的内容：" + msg;
    }
}
