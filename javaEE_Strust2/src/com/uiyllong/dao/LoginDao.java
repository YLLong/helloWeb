package com.uiyllong.dao;

import com.uiyllong.bean.Login;
import com.uiyllong.db.DBCconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Created by uilong on 2016/4/13.
 */
public class LoginDao {
    Connection conn;                    //数据库连接对象

    /**
     * 验证登录用户
     * @param name
     * @param passwd
     * @return
     */
    public Login checkLogin(String name, String passwd) {
        try {

            conn = DBCconn.getConnection();                 //获取连接对象
            String select_sql = "select * from login where name = ? and password = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(select_sql);
            preparedStatement.setString(1, name);               //设置参数用户名
            preparedStatement.setString(2, passwd);             //设置参数密码
            ResultSet resultSet = preparedStatement.executeQuery();     //执行查询，返回结果集
            if (resultSet.next()) {                             //返回集不为空
                Login login = new Login();
                login.setId(resultSet.getInt(1));
                login.setName(resultSet.getString(2));
                login.setPassword(resultSet.getString(3));
                login.setRole(resultSet.getBoolean(4));
                return login;                                   //返回已经设值的 JavaBean 对象
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            DBCconn.CloseConn();
        }
    }
}
