package com.coocaa.anniecode.rabbitmq;

import com.coocaa.anniecode.pojo.Log;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by keaxiang on 2015/12/23.
 */
public class TableOpr {

    //增加记录
    public int insert(Connection conn,Log log){
        int row = -1;
        String createTime = null;
        String time_date = null;
        String msg = null;
        String queue = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(log.getMsg() != null){
            msg = "'" + log.getMsg() + "'";
        }
        if(log.getQueue() != null){
            queue = "'" + log.getQueue() + "'";
        }


        if(log.getCreatetime() != null && log.getTimeDate() != null)
        {
            createTime = "'" + sdf.format(log.getCreatetime()) +"'";
            time_date = "'" + sdf.format(log.getTimeDate()) + "'";
        }
        if(log.getCreatetime() != null && log.getTimeDate() == null){
            createTime = "'" + sdf.format(log.getCreatetime()) + "'";
        }
        if(log.getCreatetime() == null && log.getTimeDate() != null){
            time_date = "'" + sdf.format(log.getTimeDate()) + "'";
        }

        String sql = "insert into log (queue,createtime,time_date,time_second,pid,level,msg) " +
                "values(" + queue + "," + createTime + "," + time_date + ","
                 + log.getTimeSecond() + "," + log.getPid() + "," + log.getLevel() + "," + msg + ")";

        try {
            Statement st = conn.createStatement();
            row = st.executeUpdate(sql);
            st.close();
        } catch (SQLException e) {
            System.out.println("插入新记录失败：" + e.getMessage());
        }
        return row;
    }
}

