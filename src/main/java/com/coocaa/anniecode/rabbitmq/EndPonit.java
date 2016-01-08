package com.coocaa.anniecode.rabbitmq;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by admin on 2015/12/17.
 */
public class EndPonit {
    private String host = "10.10.0.199";
    private int port = 5672;
    private String user = "admin";
    private String pswd = "131452";

    protected Channel channel;
    protected Connection connection;
    protected String queueName;

    public EndPonit(String name) throws IOException, TimeoutException {
        this.queueName = name;
        // Create a connection factory
        ConnectionFactory factory = new ConnectionFactory();

        // hostname of your rabbitmq server
        factory.setHost(host);
        factory.setPort(port);
        factory.setUsername(user);
        factory.setPassword(pswd);

        // getting a connection
        connection = factory.newConnection();

        // creating a channal
        channel = connection.createChannel();

        // declaring a queue for this channal, if queue does not exist
        // it will be created on the server.
        channel.queueDeclare(queueName, false, false, false, null);
    }


    //关闭连接
    public void close() throws IOException, TimeoutException {
        this.channel.close();
        this.connection.close();
    }
}
