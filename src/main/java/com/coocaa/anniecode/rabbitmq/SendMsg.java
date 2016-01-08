package com.coocaa.anniecode.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by keaxiang on 2016/1/6.
 */
public class SendMsg implements Runnable{
    private String queueName;
    public SendMsg(String queueName){
        this.queueName = queueName;
    }

    public void run() {
        try {
            Producer producer = new Producer(queueName);
            while(true){
                producer.sendObject("Hello,Java");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
