package com.demo.netty.day2.server;

/**
 * 服务器解码器
 * 连接建立时发送当前时间
 *
 * @Author: zhangb
 * @Date: 2018/12/18 12:26
 */

import com.demo.netty.day2.Time;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class TimeServerHandlerPOJO extends ChannelInboundHandlerAdapter {
    /**
     * 连接建立的时候并且准备进行通信时被调用
     */
    @Override
    public void channelActive(final ChannelHandlerContext ctx) throws Exception {
        // 发送当前时间信息
        ChannelFuture f = ctx.writeAndFlush(new Time());
        // 发送完毕之后关闭 Channel
        f.addListener(ChannelFutureListener.CLOSE);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}