package com.uiyllong.fileUpDownAPP.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

/**
 * Created by uilong on 2016/5/4.
 */
public class DownloadAction extends ActionSupport {

    private String majorName;
    private String grade;
    private String path;

    public InputStream getInputStream() {
        return ServletActionContext.getServletContext().getResourceAsStream(path);
    }

    @Override
    public String execute() throws Exception {
        return super.execute();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
