package com.uiyllong.action1;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.uiyllong.bean.Isbn;

/**
 * Created by uilong on 2016/4/27.
 */
public class ConverterAction extends ActionSupport implements ModelDriven<Isbn> {
    private Isbn isbn;

    public Isbn getIsbn() {
        return isbn;
    }

    public void setIsbn(Isbn isbn) {
        this.isbn = isbn;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    @Override
    public Isbn getModel() {
        isbn = new Isbn();
        return isbn;
    }
}
