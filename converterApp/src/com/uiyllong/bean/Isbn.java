package com.uiyllong.bean;

/**
 * Created by uilong on 2016/4/27.
 */
public class Isbn {
    private String book;
    private String country_language;
    private String press;
    private String bookID;
    private String checkCode;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getCountry_language() {
        return country_language;
    }

    public void setCountry_language(String country_language) {
        this.country_language = country_language;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public Isbn() {
    }

    public Isbn(String book, String country_language, String press, String bookID, String checkCode) {
        this.book = book;
        this.country_language = country_language;
        this.press = press;
        this.bookID = bookID;
        this.checkCode = checkCode;
    }

}
