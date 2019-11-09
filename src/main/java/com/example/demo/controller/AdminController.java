package com.example.demo.controller;

import com.example.demo.entity.Mycour;
import com.example.demo.entity.Query;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;


    @RequestMapping("/InsertByAdmin-s")
    public String InsertByAdmins (HttpServletRequest httpServletRequest){
        String id = httpServletRequest.getParameter("id");
        String name=httpServletRequest.getParameter("username");
        String pwd = httpServletRequest.getParameter("password");
        Student student=new Student();
        student.setSid(id);
        student.setSname(name);
        student.setSpwd(pwd);
        adminService.AdminInsert(student);
        return "redirect:/SelectByAll";
    }

    @RequestMapping("/DeleteByAdmin-s")
    public String DeleteByAdmin (HttpServletRequest httpServletRequest){
        String Sid=httpServletRequest.getParameter("Sid");
        adminService.AdminDelete(Sid);
        return "redirect:/SelectByAll";
    }

    @RequestMapping("/SelectByAll")
    public String SelectStudent(Map<String, List<Student>> map){
        map.put("Students", adminService.SelectStudent());
        return "admin-student";
    }



    @RequestMapping("/InsertByAdmin-t")
    public String InsertByAdminst (HttpServletRequest httpServletRequest){
        String id = httpServletRequest.getParameter("id");
        String name=httpServletRequest.getParameter("username");
        String pwd = httpServletRequest.getParameter("password");
        Teacher teacher=new Teacher();
        teacher.setTid(id);
        teacher.setTname(name);
        teacher.setTpwd(pwd);
        adminService.AdminInsertt(teacher);
        return "redirect:/SelectByAll-t";
    }

    @RequestMapping("/DeleteByAdmin-t")
    public String DeleteByAdmint (HttpServletRequest httpServletRequest){
        String Tid=httpServletRequest.getParameter("Tid");
        adminService.AdminDeletet(Tid);
        return "redirect:/SelectByAll";
    }

    @RequestMapping("/SelectByAll-t")
    public String SelectTeacher(Map<String, List<Teacher>> map){
        map.put("Teachers", adminService.SelectTeacher());
        return "/admin-teacher";
    }
    @RequestMapping("/selectallcours")
    public String selectallcours( Map<String,List<Query>> map){
        map.put("Allcours",adminService.getallcour());
        return "admin-grantcour";
    }
    @RequestMapping("/grantcour")
    public String grantcour(String Cid){
        adminService.grantcour(Cid);
        return "redirect:/selectallcours";
    }

    @RequestMapping("InsertExec")
    public String InsertExec(String Cid,String Work_label){
        adminService.AdminInsertExce(Cid,Work_label);
        return "redirect:/QueryByTime-a";
    }

    @RequestMapping("DeleteExec")
    public String DeleteExec(String Cid){
        adminService.AdminDeleteExce(Cid);
        return "redirect:/QueryByTime-a";
    }
}
