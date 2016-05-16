package com.uiyllong.pagingapp.dao;

import com.uiyllong.pagingapp.bean.Goods;
import com.uiyllong.pagingapp.jdbcConnect.JdbcUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by uilong on 2016/5/12.
 */
public class PageDao {

    JdbcUtil jdbcUtil = new JdbcUtil();

    public List<Goods> pageGoods(int pageNum, int pageSize) {
        List<Goods> list = new ArrayList<>();
        if (JdbcUtil.getConnection() == null) {
            JdbcUtil.getConnection();
        }
        String sql = "select * from goods limit ?, ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = JdbcUtil.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, (pageNum - 1) * pageSize);
            preparedStatement.setInt(2, pageSize);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Goods goods = new Goods();
                goods.setId(rs.getInt("id"));
                goods.setGoodsName(rs.getString("goodsName"));
                goods.setPrice(rs.getDouble("price"));
                goods.setNum(rs.getInt("num"));
                goods.setYieldly(rs.getString("yieldly"));
                list.add(goods);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (JdbcUtil.getConnection() != null)
                jdbcUtil.closeConnection();
        }
        return list;
    }

    public int getGoodsCount() {
        int i = 0;
        if (JdbcUtil.getConnection() == null) {
            JdbcUtil.getConnection();
        }
        String sql = "select count(*) from goods";
        PreparedStatement ps = null;
        try {
            ps = JdbcUtil.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                i = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (JdbcUtil.getConnection() != null) {
                jdbcUtil.closeConnection();
            }
        }
        return i;
    }

}
