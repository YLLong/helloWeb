package com.uiyllong.bean;

/**
 * sports 和 languages 都是复选框的值，这里直接封装成字符串
 * Created by uilong on 2016/4/19.
 */
public class UserLogin_1 {
    private String username;
    private String password;
    private String sports;
    private String languages;

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
