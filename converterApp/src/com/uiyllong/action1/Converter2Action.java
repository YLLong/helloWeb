package com.uiyllong.action1;

import com.opensymphony.xwork2.ActionSupport;
import com.uiyllong.bean.Isbn;

/**
 * Created by uilong on 2016/4/27.
 */
public class Converter2Action extends ActionSupport {
    private Isbn[] isbn;

    public Isbn[] getIsbn() {
        return isbn;
    }

    public void setIsbn(Isbn[] isbn) {
        this.isbn = isbn;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

}
