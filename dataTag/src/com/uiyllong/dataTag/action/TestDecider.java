package com.uiyllong.dataTag.action;

import org.apache.struts2.util.SubsetIteratorFilter;

/**
 * Created by uilong on 2016/5/4.
 */
public class TestDecider implements SubsetIteratorFilter.Decider {
    @Override
    public boolean decide(Object o) throws Exception {
        String ob = (String) o;
        return ob.contains("c");
    }
}
