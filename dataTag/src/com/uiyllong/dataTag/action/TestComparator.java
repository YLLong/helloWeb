package com.uiyllong.dataTag.action;

import java.util.Comparator;

/**
 * Created by uilong on 2016/5/4.
 */
public class TestComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (o1.toString().charAt(0) - o2.toString().charAt(0));
    }
}
