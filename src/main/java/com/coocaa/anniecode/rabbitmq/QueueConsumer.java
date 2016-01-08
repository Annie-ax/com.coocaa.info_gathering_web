package com.coocaa.anniecode.rabbitmq;

import com.rabbitmq.client.QueueingConsumer;
import org.apache.commons.lang.SerializationUtils;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/**
 * Created by admin on 2015/12/17.
 */
public class QueueConsumer extends EndPonit implements Runnable {
    private QueueingConsumer consumer;

    public QueueConsumer(String queueName) throws IOException, TimeoutException {
        super(queueName);
        consumer = new QueueingConsumer(channel);
        channel.basicConsume(queueName, true, consumer);
    }

    public void run() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/test";
            String user = "root";
            String pwd = "1234";
            DatabaseOpr databaseOpr = new DatabaseOpr(url,user,pwd,driver);
            Connection conn = databaseOpr.connDb();
            SaveMsg saveMsg = new SaveMsg();

            while (true) {
                QueueingConsumer.Delivery delivery = consumer.nextDelivery();
                String str = (String)SerializationUtils.deserialize(delivery.getBody());
                System.out.println("Received:" + str);

                //将消息存入数据库
                saveMsg.savetoDb(conn,str);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
