package com.uiyllong.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.*;
import java.util.List;

/**
 * Created by uilong on 2016/4/25.
 */
public class Up_DownLoadAction extends ActionSupport {

    private File upload;
    private List<File> upload1;
    private String uploadFileName;
    private List<String> upload1FileName;

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public List<File> getUpload1() {
        return upload1;
    }

    public void setUpload1(List<File> upload1) {
        this.upload1 = upload1;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public List<String> getUpload1FileName() {
        return upload1FileName;
    }

    public void setUpload1FileName(List<String> upload1FileName) {
        this.upload1FileName = upload1FileName;
    }

    /**
     * 单个文件上传的响应函数
     * @return
     * @throws Exception
     */
    public String single() throws Exception {
        InputStream is = new FileInputStream(getUpload());
        OutputStream os = new FileOutputStream("G:\\C盘移动\\Desktop\\" + uploadFileName);
        byte buffer[] = new byte[1024];
        int count = 0;
        while ((count=is.read(buffer)) > 0) {
            os.write(buffer, 0, count);
        }
        os.close();
        is.close();
        return "single";
    }

    /**
     * 多文件上传的处理方法
     * @return
     * @throws Exception
     */
    public String multiple() throws Exception {
        if (upload1 != null) {
            for (int i = 0; i < upload1.size(); i++) {
                InputStream is = new FileInputStream(upload1.get(i));
                OutputStream os = new FileOutputStream("G:\\C盘移动\\Desktop\\" + getUpload1FileName().get(i));
                byte buffer[] = new byte[1024];
                int count = 0;
                while ((count=is.read(buffer)) > 0) {
                    os.write(buffer, 0, count);
                }
                os.close();
                is.close();
            }
        }
        return "multiple";
    }

    private String contentType;
    private long contentLength;
    private String contentDisposition;
    private InputStream inputStream;

    public String getContentType() {
        return contentType;
    }

    public long getContentLength() {
        return contentLength;
    }

    public String getContentDisposition() {
        return contentDisposition;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public String download() throws Exception {
        contentType = "text/html";
        contentDisposition = "attachment;filename=hidden.html";
        ServletContext servletContext = ServletActionContext.getServletContext();
        String fileName = servletContext.getRealPath("/files/hidden.html");
        inputStream = new FileInputStream(fileName);
        contentLength = inputStream.available();
        return "download";
    }
}
