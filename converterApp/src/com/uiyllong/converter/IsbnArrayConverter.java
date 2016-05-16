package com.uiyllong.converter;

import com.uiyllong.bean.Isbn;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by uilong on 2016/4/27.
 */
public class IsbnArrayConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        Isbn[] isbn = new Isbn[strings.length];
        for (int i = 0; i < strings.length; i++) {
            Isbn ib = new Isbn();
            String[] str = strings[i].split("-");
            ib.setCountry_language(str[0] + "-" + str[1]);
            ib.setPress(str[2]);
            ib.setBookID(str[3]);
            ib.setCheckCode(str[4]);
            isbn[i] = ib;
        }
        return isbn;
    }

    @Override
    public String convertToString(Map map, Object o) {
        Isbn[] isbn = (Isbn[]) o;
        String sReturn = "[";
        for (int i = 0; i < isbn.length; i++) {
            sReturn += isbn[i].getCountry_language() + "-" + isbn[i].getPress() + "-" + isbn[i].getBookID() + "-" + isbn[i].getCheckCode() + "  ";
        }
        sReturn += "]";
        return sReturn;
    }
}
