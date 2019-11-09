package com.example.demo.controller;

import com.example.demo.conf.WebSecurityConfig;
import com.example.demo.dao.RegisterMapper;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.service.RegisterService;
import com.example.demo.service.impl.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.Console;

@Controller
public class RegisterController {
    @Autowired
    private RegisterServiceImpl registerService;

    @RequestMapping("/registerin")
    public ModelAndView registerin(HttpServletRequest httpServletRequest2,
                                                         HttpServletResponse httpServletResponse, HttpSession session)
    {
        ModelAndView andView = new ModelAndView();
        String id = httpServletRequest2.getParameter("id");
        String name=httpServletRequest2.getParameter("username");
        String pwd = httpServletRequest2.getParameter("password");
        String retype= httpServletRequest2.getParameter("re-gettype");
//        System.out.println(retype);
        if (retype.equals("student") )
        {
            Student student=new Student();
            student.setSid(id);
            student.setSname(name);
            student.setSpwd(pwd);
           registerService.insertstu(student);
            andView.setViewName("login");
        }
        if (retype.equals("teacher") )
        {
            Teacher teacher=new Teacher();
            teacher.setTid(id);
            teacher.setTname(name);
            teacher.setTpwd(pwd);
            registerService.inserttea(teacher);
            andView.setViewName("login");
        }
        return andView;
    }
}
