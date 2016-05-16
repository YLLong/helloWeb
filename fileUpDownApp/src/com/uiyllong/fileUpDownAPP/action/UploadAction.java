package com.uiyllong.fileUpDownAPP.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.io.*;
import java.util.Map;

/**
 * Created by uilong on 2016/5/4.
 */
public class UploadAction extends ActionSupport {
    private String username;
    private String majorName;
    private String grade;
    private File[] files;
    private String[] filesFileName;
    private String[] filesContentType;

    @Override
    public String execute() throws Exception {
        for (int i = 0; i < files.length; i++) {
            System.out.println(filesFileName[i]);
            System.out.println(filesContentType[i]);
        }
        ActionContext ac = ActionContext.getContext();
        Map session = ac.getSession();
        session.put("username", username);
        String uploadfileresult = filterType(filesContentType);
        if (uploadfileresult != null) {
            return uploadfileresult;
        }
        for (int i = 0;i < files.length; i++) {
            InputStream is = new FileInputStream(files[i]);
            OutputStream os = new FileOutputStream("D:/Projects/helloWeb/fileUpDownApp/web/uploadfile/" + filesFileName[i]);
            byte[] buffer = new byte[1024];
            int count = 0;
            while ((count=is.read(buffer)) > 0) {
                os.write(buffer, 0, count);
            }
            os.close();
            is.close();
        }
        return SUCCESS;
    }

    /**
     * 验证上传文件的格式及大小
     * 返回 null 即成功
     * 返回 INPUT 即失败
     * @param types
     * @return
     */
    public String filterType(String[] types) {
        String[] photoTpye = {"image/gif", "image/jpeg"};
        String userInfoType = "application/msword";
        for (int j = 0; j < photoTpye.length; j++) {
            if (types[0].equals(photoTpye[j])) {
                if (files[0].length() < 1024*50) {
                    if (types[1].equals(userInfoType)) {
                        if (types[1].length() < 1024*1024*2) {
                            return null;
                        }
                        addFieldError("userInfoSizeError", "个人简历文件过大,必须小于2M!");
                        return INPUT;
                    }
                    addFieldError("userInfoTypeError", "个人简历文件格式不对,只能是 doc 格式！");
                    return INPUT;
                }
                addFieldError("photoSizeError", "头像过大,必须小于50k!");
                return INPUT;
            }
        }
        addFieldError("photoTypeError", "图片格式不对,只能是 gif 或 jpeg 格式！");
        return INPUT;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public String[] getFilesFileName() {
        return filesFileName;
    }

    public void setFilesFileName(String[] filesFileName) {
        this.filesFileName = filesFileName;
    }

    public String[] getFilesContentType() {
        return filesContentType;
    }

    public void setFilesContentType(String[] filesContentType) {
        this.filesContentType = filesContentType;
    }
}
