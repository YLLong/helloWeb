package com.uiyllong.pagingapp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.uiyllong.pagingapp.bean.Goods;
import com.uiyllong.pagingapp.dao.PageDao;

import java.util.List;

/**
 * Created by uilong on 2016/5/12.
 */
public class AllGoodsAction extends ActionSupport {

    private int pageNum;
    private int pageSize;
    private int totalpage;
    private List<Goods> list;

    @Override
    public String execute() throws Exception {
        PageDao pageDao = new PageDao();
        list = pageDao.pageGoods(pageNum, pageSize);
        return SUCCESS;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public List<Goods> getList() {
        return list;
    }

    public void setList(List<Goods> list) {
        this.list = list;
    }
}
