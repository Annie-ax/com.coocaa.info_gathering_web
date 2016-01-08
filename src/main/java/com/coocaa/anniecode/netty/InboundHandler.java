package com.coocaa.anniecode.netty;

import com.coocaa.anniecode.rabbitmq.Producer;
import com.coocaa.anniecode.rabbitmq.QueueConsumer;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeoutException;

/**
 * Created by keaxiang on 2015/12/28.
 */
public class InboundHandler extends ChannelInboundHandlerAdapter{

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        //uper.channelActive(ctx);
        System.out.println(ctx.toString() + " 连接进来了");

        //一旦有客户端连接进来，那么便开始从队列读消息
        /*try {
            QueueConsumer queueConsumer = new QueueConsumer("queue1");
            Thread consumerThread = new Thread(queueConsumer);
            consumerThread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        System.out.println(ctx.toString() + " 退出了");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        //获取客户端发来的数据
        /*ByteBuf result = (ByteBuf) msg;
        byte[] result1 = new byte[result.readableBytes()];
        result.readBytes(result1);
        String resultStr = new String(result1);
        System.out.println(resultStr);
        result.release();*/
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("有人意外退出了");
        ctx.close();
    }

}
