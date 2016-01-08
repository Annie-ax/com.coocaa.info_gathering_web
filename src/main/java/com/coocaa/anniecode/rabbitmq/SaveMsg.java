package com.coocaa.anniecode.rabbitmq;

import com.coocaa.anniecode.pojo.Log;

import java.sql.Connection;

/**
 * Created by keaxiang on 2016/1/6.
 */
public class SaveMsg {
    //将消息保存到数据库(mysql)
    public void savetoDb(Connection conn,String str){
        //首先要将传过来的消息进行分割（这里暂时没做）

        Log log = new Log();
        log.setMsg(str);

        TableOpr tableOpr = new TableOpr();
        tableOpr.insert(conn,log);

    }

}
