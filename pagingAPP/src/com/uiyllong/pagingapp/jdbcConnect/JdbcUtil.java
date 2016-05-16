package com.uiyllong.pagingapp.jdbcConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by uilong on 2016/5/12.
 */
public class JdbcUtil {

    private static Connection connection;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql:///mbook";
    private static final String username = "root";
    private static final String password = "06dmysql";

    public static Connection getConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void closeConnection() {
        try {
            getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
