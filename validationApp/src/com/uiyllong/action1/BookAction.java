package com.uiyllong.action1;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * Created by uilong on 2016/4/28.
 */
public class BookAction extends ActionSupport {

    private String bookName;
    private String author;
    private String ISBN;
    private String press;
    private Date publicationDate;
    private Double price;
    private Integer stockNum;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    @Override
    public void validate() {
        String regex = "97(?:8|9)([ -])\\d{1,5}\\1\\d{1,7}\\1\\d{1,6}\\1\\d$";
        String regex1 = ".*出版社.*";
        if (!ISBN.matches(regex)) {
            addFieldError("ISBN", "不能为空且字符长度为13或输入的ISBN不符合格式");
        } else if (!press.matches(regex1)) {
            addFieldError("press", "出版社名字不能为空且包含‘出版社’这个字符");
        }
    }

}
