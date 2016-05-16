package com.uiyllong.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by uilong on 2016/4/13.
 */
public class DBCconn {
    public static Connection connection;                // Connection 对象(连接)
    // 获取数据库连接
    public static Connection getConnection() {
        try {
            // 加载注册 MySQL 数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/MBOOK";
            connection = DriverManager.getConnection(url, "root", "06dmysql");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 关闭数据库连接
    public static void CloseConn() {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
