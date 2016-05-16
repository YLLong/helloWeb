package com.uiyllong.pagingapp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.uiyllong.pagingapp.dao.PageDao;

/**
 * Created by uilong on 2016/5/12.
 */
public class PageAction extends ActionSupport {
    private int pageNum;
    private int pageSize;
    private int totalpage;

    @Override
    public String execute() throws Exception {
        PageDao pageDao = new PageDao();
        pageSize = 4;
        int goodsCount = pageDao.getGoodsCount();
        totalpage = goodsCount % pageSize == 0 ? (goodsCount / pageSize) : (goodsCount / pageSize + 1);
        if (pageNum <= 0) {
            pageNum = 1;
        }
        if (pageNum > totalpage) {
            pageNum = totalpage;
        }
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
}
