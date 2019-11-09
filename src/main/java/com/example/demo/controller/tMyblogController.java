package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.tMyblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class tMyblogController {
    @Autowired
    private tMyblogService  tmyblogService;
    @RequestMapping("/tomyblogt")
    public ModelAndView tomyblogt(Map<String,List<Openblog>> map1,HttpServletRequest httpServletRequest,
                                  HttpServletResponse httpServletResponse, HttpSession session){
        ModelAndView andView = new ModelAndView();
        String  tid=(String)httpServletRequest.getSession().getAttribute("tid");
        Teacher teacher=tmyblogService.getteacherbytid(tid);     //取学生信息
        String tname=teacher.getTname();
        andView.addObject("name",tname);

        Myblog nblog=tmyblogService.getallblog(tid);    //取博客信息

        String ntext = nblog.getPri_page();
        andView.addObject("ntext", ntext);


        Message message=tmyblogService.getallmessage(tid);   //取留言信息
        String mcontext=message.getMcontext();
        String acontext=message.getAcontext();
        andView.addObject("mcontext",mcontext);
        andView.addObject("acontext",acontext);

        andView.setViewName("myblogt");

        map1.put("allblogs",tmyblogService.getblogs(tid));    //取帖子信息
        return andView;
    }
    @RequestMapping("/edittname")
    public String edittname(HttpServletRequest httpServletRequest,
                            HttpServletResponse httpServletResponse, HttpSession session) {
        String  tid=(String)httpServletRequest.getSession().getAttribute("tid");
        String tname = httpServletRequest.getParameter("name");
        System.out.println(tid+tname);
       Teacher teacher=new Teacher();
       teacher.setTname(tname);
       teacher.setTid(tid);
        this.tmyblogService.updateteachername(teacher);
        return "redirect:/tomyblogt";
    }
    @RequestMapping("/edittextt")
    public String edittextt(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse, HttpSession session) {
//        ModelAndView andView = new ModelAndView();
        String tid = (String) httpServletRequest.getSession().getAttribute("tid");
        String text = httpServletRequest.getParameter("text");
//        Student student=myblogService.getstudentbysid(sid);
//        String sname=student.getSname();
//        andView.addObject("sname",sname);

        Myblog myblog = new Myblog();
        myblog.setId(tid);
        myblog.setPri_page(text);

        this.tmyblogService.updateblogtext(myblog);
        return "redirect:/tomyblogt";
    }
    @RequestMapping("/edittpwd")
    public String edittpwd(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse, HttpSession session) {
        String  tid=(String)httpServletRequest.getSession().getAttribute("tid");
        String tpwd = httpServletRequest.getParameter("pwd");
        System.out.println(tid+tpwd);
        Teacher teacher=new Teacher();
        teacher.setTpwd(tpwd);
        teacher.setTid(tid);
        this.tmyblogService.updateteapwd(teacher);
        return "redirect:/tomyblogt";
    }
    @RequestMapping("/editmessaget")
    public String editmessage(HttpServletRequest httpServletRequest,
                              HttpServletResponse httpServletResponse, HttpSession session) {
        String  tid=(String)httpServletRequest.getSession().getAttribute("tid");
        String mcontext = httpServletRequest.getParameter("mcontext");
        String acontext=httpServletRequest.getParameter("acontext");
        Message message=new Message();
        message.setId(tid);
        message.setMcontext(mcontext);
        message.setAcontext(acontext);
        System.out.println(message.getAcontext());
        System.out.println(message.getMcontext());

        this.tmyblogService.updatemessage(message);
        return "redirect:/tomyblogt";
    }
}
