package com.coocaa.anniecode.rabbitmq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by keaxiang on 2015/12/21.
 */
public class DatabaseOpr {
    private static String url;
    private static String username;
    private static String password;
    private static String driver;
    private static Connection conn;

    public DatabaseOpr(String url, String username, String password, String driver) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.driver = driver;
    }

    //连接数据库
    public Connection connDb() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            //System.out.println("连接mysql成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void closeConn() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("数据库关闭异常:" + e.getMessage());
        }
    }
}
