package com.coocaa.anniecode.rabbitmq;

import org.apache.commons.lang.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.TimeoutException;

/**
 * Created by admin on 2015/12/17.
 */
public class Producer extends EndPonit implements Runnable{
    public Producer(String queueName) throws IOException, TimeoutException {
        super(queueName);
    }

    public void sendObject(Serializable object) throws IOException {
        channel.basicPublish("", queueName, null, SerializationUtils.serialize(object));
    }

    public void run() {
        try {
            while(true){
                sendObject("hello,Netty");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
