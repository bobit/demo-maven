package com.demo.netty.day2.client;


import com.demo.netty.day2.Time;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.Date;


/**
 * 客户端数据处理类
 *
 * @Author: zhangb
 * @Date: 2018/12/18 12:31
 */
public class TimeClientHandlerPOJO extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        // 直接将信息转换成Time类型输出即可
        Time time = (Time) msg;
        System.out.println("Time类型输出：" + new Date(System.currentTimeMillis()).toString());
        System.out.println("将信息转换成Time类型输出：" + time);
        ctx.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}