package com.uiyllong.converter;

import com.uiyllong.bean.Isbn;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by uilong on 2016/4/27.
 */
public class IsbnConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        Isbn isbn = new Isbn();
        String[] str = strings[0].split("-");
        isbn.setCountry_language(str[0] + "-" + str[1]);
        isbn.setPress(str[2]);
        isbn.setBookID(str[3]);
        isbn.setCheckCode(str[4]);
        return isbn;
    }

    @Override
    public String convertToString(Map map, Object o) {
        Isbn isbn = (Isbn) o;
        return isbn.getCountry_language() + "-" + isbn.getPress() + "-" + isbn.getBookID() + "-" + isbn.getCheckCode();
    }

}
