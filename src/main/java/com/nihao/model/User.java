package com.nihao.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 152759428530502726L;

	private Integer id;

    private String loginname;

    private String pwd;

    private String username;

    private String gender;

    private String birthday;

    private String phonenum;

    private String email;

    private String photo;

    private Date cdatetime;

    private Date udatatime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Date getCdatetime() {
        return cdatetime;
    }

    public void setCdatetime(Date cdatetime) {
        this.cdatetime = cdatetime;
    }

    public Date getUdatatime() {
        return udatatime;
    }

    public void setUdatatime(Date udatatime) {
        this.udatatime = udatatime;
    }
}