package com.example.demo.entity;

import java.util.Date;

public class Mycour {
    private String Sid;
    private String Cid;
    private String Cname;
    private String Label;
    private String ppt;
    private String Work_word;
    private String Work_name;
    private String Work_picture1;
    private String Work_picture2;
    private String Work_picture3;
    private String Work_code;
    private String Grade;

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public Mycour() {
        Sid = null;
        Cid = null;
        Cname = null;
        Label = null;
        this.ppt = null;
        Work_word = null;
        Work_name = null;
        Work_picture1 = null;
        Work_picture2 = null;
        Work_picture3 = null;
        Work_code = null;
        Grade=null;
    }

    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }

    public String getWork_name() {
        return Work_name;
    }

    public void setWork_name(String work_name) {
        Work_name = work_name;
    }

    public String getWork_picture1() {
        return Work_picture1;
    }

    public void setWork_picture1(String work_picture1) {
        Work_picture1 = work_picture1;
    }

    public String getWork_picture2() {
        return Work_picture2;
    }

    public void setWork_picture2(String work_picture2) {
        Work_picture2 = work_picture2;
    }

    public String getWork_picture3() {
        return Work_picture3;
    }

    public void setWork_picture3(String work_picture3) {
        Work_picture3 = work_picture3;
    }

    public String getWork_code() {
        return Work_code;
    }

    public void setWork_code(String work_code) {
        Work_code = work_code;
    }

    public Date getUploadtiem() {
        return Uploadtiem;
    }

    public void setUploadtiem(Date uploadtiem) {
        Uploadtiem = uploadtiem;
    }

    private Date Uploadtiem;
    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getWork_word() {
        return Work_word;
    }

    public void setWork_word(String work_word) {
        Work_word = work_word;
    }

}
