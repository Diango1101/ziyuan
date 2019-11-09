package com.example.demo.entity;

import java.util.Date;

public class Opencour {
    private String tid;
    private String cid;
    private String ppt;
    private String cname;
    private String label;
    private String processchart;
    private String outline;
    private String exinstruct;
    private Date uploadtime;

    public Opencour() {
        this.tid = null;
        this.cid =  null;
        this.ppt =  null;
        this.cname =  null;
        this.label =  null;
        this.processchart =  null;
        this.outline =  null;
        this.exinstruct =  null;
        this.uploadtime = new Date();
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getProcesschart() {
        return processchart;
    }

    public void setProcesschart(String processchart) {
        this.processchart = processchart;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getExinstruct() {
        return exinstruct;
    }

    public void setExinstruct(String exinstruct) {
        this.exinstruct = exinstruct;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }
}
