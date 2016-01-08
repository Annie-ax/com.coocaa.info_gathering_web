package com.coocaa.anniecode.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

import java.util.concurrent.TimeUnit;

/**
 * Created by keaxiang on 2015/12/28.
 */
public class Client {

    private String host;
    private int port;

    public Client(String host,int port){
        this.host = host;
        this.port = port;
    }

    public void conn() {
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            final Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(workerGroup);
            bootstrap.channel(NioSocketChannel.class);
            bootstrap.option(ChannelOption.SO_KEEPALIVE, true);
            bootstrap.handler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    //ch.pipeline().addLast(new LineBasedFrameDecoder(1024));
                    ch.pipeline().addLast(new ClientHandler());
                    //ch.pipeline().addLast(new StringDecoder());
                }
            });

            // 发起连接
            ChannelFuture f = bootstrap.connect(host, port).sync();

            //等待链路关闭.
            f.channel().closeFuture().sync();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }


    public static void main(String[] args){
        int port = 8088;
        if (args != null && args.length > 0){
            try {
                port = Integer.valueOf(args[0]);
            }catch (NumberFormatException e){

            }
        }
        new Client("127.0.0.1", port).conn();
    }
}
