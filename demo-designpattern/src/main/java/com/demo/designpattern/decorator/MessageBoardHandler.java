package com.demo.designpattern.decorator;

/**
 * 用户留言板处理的接口
 *
 * @Author: zhangb
 * @Date: 2019/3/8 15:45
 */
public interface MessageBoardHandler {
    /**
     * @author zhangb 用户可以利用函数留言
     */
    public String filter(String msg);
}
