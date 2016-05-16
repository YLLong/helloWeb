package com.uiyllong.fromtagsapp.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uilong on 2016/4/26.
 */
public class BookList {
    private static List<Book> books = new ArrayList<Book>();

    static {
        books.add(new Book("AA", "aa"));
        books.add(new Book("BB", "bb"));
        books.add(new Book("CC", "cc"));
        books.add(new Book("DD", "dd"));
    }

    public static List<Book> getBooks() {
        return books;
    }

    public static void setBooks(List<Book> books) {
        BookList.books = books;
    }

}
