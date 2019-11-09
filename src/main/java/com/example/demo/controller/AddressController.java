package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressController {
    @RequestMapping("/login")
    public String toLogin() {
        return "login";
    }
    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }
    @RequestMapping("/index-s")
    public String toIndexS() {
        return "index-s";
    }
    @RequestMapping("/index-t")
    public String toIndexT() {
        return "index-t";
    }
    @RequestMapping("/register")
    public String register(){ return "zhuce"; }
    @RequestMapping("/admin")
    public String toIndexA(){
        return "index-admin";
    }
    @RequestMapping("/myblog")
    public String toMyblog(){ return "myblog"; }
    @RequestMapping("/query1")
    public String toQuery1(){ return "query1"; }
    @RequestMapping("/openblog")
    public String openblog(){return "openblog";}
    @RequestMapping("/openblogt")
    public String openblogt(){return "openblogt";}
    @RequestMapping("/opennewcour")
    public String opennewcour(){return "opencourse";}
    @RequestMapping("/coursemanage")
    public String coursemanage(){return "coursemanage";}
    @RequestMapping("/admin-addStudent")
    public String admin_addStu(){return "admin-addStudent";}
    @RequestMapping("/admin-addTeacher")
    public String admin_addTea(){return "admin-addTeacher";}
    @RequestMapping("/admin-selecttea")
    public String admin_selecttea(){return "admin-teacher";}


}
