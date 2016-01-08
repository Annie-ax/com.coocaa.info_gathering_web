package com.coocaa.anniecode.netty;

import com.coocaa.anniecode.rabbitmq.Producer;
import com.coocaa.anniecode.rabbitmq.SendMsg;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by keaxiang on 2015/12/28.
 */
public class ClientHandler extends ChannelInboundHandlerAdapter {

    //private Thread sendMsg;

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("糟糕，与服务器的连接断开了！");

    }


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        System.out.println("连接到服务器。。。");

        //连接建立时，向服务端发送消息
        Thread sendMsg = new Thread(new SendMsg("queue1"));
        sendMsg.start();

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("异常了！");
        //cause.printStackTrace();
        ctx.close();
    }

}
