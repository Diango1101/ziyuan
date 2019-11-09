package com.example.demo.entity;

import java.util.Date;

public class Query {
    private String Cid;
    private String ProcessChart;
    private String Outline;
    private String ExperimentInstructer;
    private int Click_rate;
    private String Cname;
    private Date UploadTime;
    private String Label;
    private String Ststus;

    public String getStatus() {
        return Ststus;
    }

    public void setStatus(String ststus) {
        Ststus = ststus;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public String getProcessChart() {
        return ProcessChart;
    }

    public void setProcessChart(String processChart) {
        ProcessChart = processChart;
    }

    public String getOutline() {
        return Outline;
    }

    public void setOutline(String outline) {
        Outline = outline;
    }

    public String getExperimentInstructer() {
        return ExperimentInstructer;
    }

    public void setExperimentInstructer(String experimentInstructer) {
        ExperimentInstructer = experimentInstructer;
    }

    public int getClick_rate() {
        return Click_rate;
    }

    public void setClick_rate(int click_rate) {
        Click_rate = click_rate;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public Date getUploadTime() {
        return UploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        UploadTime = uploadTime;
    }
}
