package com.example.demo.controller;

import com.example.demo.entity.Openblog;
import com.example.demo.service.OpenblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class OpenblogController {
    @Autowired
    private OpenblogService openblogService;
    @RequestMapping("/opennewblog")
    public String opennewblog(HttpServletRequest httpServletRequest,
                              HttpServletResponse httpServletResponse, HttpSession session)
    {
        String id=(String) httpServletRequest.getSession().getAttribute("sid");
        String blogtext=httpServletRequest.getParameter("blogtext");
        String cid=httpServletRequest.getParameter("cid");
        String cname=httpServletRequest.getParameter("cname");
        Float sgrade=Float.parseFloat(httpServletRequest.getParameter("sgrade"));
        Openblog openblog=new Openblog();
        openblog.setId(id);
        openblog.setBlog(blogtext);
        openblog.setCid(cid);
        openblog.setCname(cname);
        openblog.setSgrade(sgrade);
        this.openblogService.insertopenblog(openblog);
        return "redirect:/tomyblog";
    }
    @RequestMapping("/opennewblogt")
    public String opennewblogt(HttpServletRequest httpServletRequest,
                              HttpServletResponse httpServletResponse, HttpSession session)
    {
        String id=(String) httpServletRequest.getSession().getAttribute("tid");
        String blogtext=httpServletRequest.getParameter("blogtext");
        String cid=httpServletRequest.getParameter("cid");
        String cname=httpServletRequest.getParameter("cname");
        Float sgrade=Float.parseFloat(httpServletRequest.getParameter("sgrade"));
        Openblog openblog=new Openblog();
        openblog.setId(id);
        openblog.setBlog(blogtext);
        openblog.setCid(cid);
        openblog.setCname(cname);
        openblog.setSgrade(sgrade);
        this.openblogService.insertopenblog(openblog);
        return "redirect:/tomyblogt";
    }
}
