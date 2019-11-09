package com.example.demo.controller;

import com.example.demo.entity.Message;
import com.example.demo.entity.Myblog;
import com.example.demo.entity.Openblog;
import com.example.demo.entity.Student;
import com.example.demo.service.MyblogService;
import javafx.application.Application;
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
public class MyblogController {
    @Autowired
    private MyblogService myblogService;
    @RequestMapping("/tomyblog")
    public ModelAndView tomyblog(Map<String,List<Openblog>> map,HttpServletRequest httpServletRequest,
                                 HttpServletResponse httpServletResponse, HttpSession session){
        ModelAndView andView = new ModelAndView();
       String  sid=(String)httpServletRequest.getSession().getAttribute("sid");

        Student student=myblogService.getstudentbysid(sid);     //取学生信息
        String sname=student.getSname();
        andView.addObject("name",sname);

        Myblog nblog=myblogService.getallblog(sid);    //取博客信息

            String ntext = nblog.getPri_page();
            andView.addObject("ntext", ntext);
        Message message=myblogService.getallmessage(sid);   //取留言信息
                String mcontext=message.getMcontext();
                String acontext=message.getAcontext();
                andView.addObject("mcontext",mcontext);
                andView.addObject("acontext",acontext);
        andView.setViewName("myblog");

        map.put("allblogs",myblogService.getblogs(sid));    //取帖子信息
        return andView;
    }
    @RequestMapping("/editsname")
    public String editsname(HttpServletRequest httpServletRequest,
                            HttpServletResponse httpServletResponse, HttpSession session) {
        String sid = (String) httpServletRequest.getSession().getAttribute("sid");
        String sname = httpServletRequest.getParameter("name");
        System.out.println(sid + sname);
        Student student = new Student();
        student.setSname(sname);
        student.setSid(sid);
        this.myblogService.updatestudentname(student);
        return "redirect:/tomyblog";
    }
    @RequestMapping("/editspwd")
    public String editspwd(HttpServletRequest httpServletRequest,
                            HttpServletResponse httpServletResponse, HttpSession session) {
        String  sid=(String)httpServletRequest.getSession().getAttribute("sid");
        String spwd = httpServletRequest.getParameter("pwd");
        System.out.println(sid+spwd);
        Student student=new Student();
        student.setSpwd(spwd);
        student.setSid(sid);
        this.myblogService.updatestupwd(student);
        return "redirect:/tomyblog";
    }
    @RequestMapping("/edittext")
    public String edittext(HttpServletRequest httpServletRequest,
                                 HttpServletResponse httpServletResponse, HttpSession session){
//        ModelAndView andView = new ModelAndView();
        String  sid=(String)httpServletRequest.getSession().getAttribute("sid");
       String text = httpServletRequest.getParameter("text");
//        Student student=myblogService.getstudentbysid(sid);
//        String sname=student.getSname();
//        andView.addObject("sname",sname);

        Myblog myblog=new Myblog();
        myblog.setId(sid);
        myblog.setPri_page(text);

        this.myblogService.updateblogtext(myblog);

        //不知道如何返回路径，modelandview只能返回网页，所以这里为了刷新页面功能，将上一个方法的实现复制下来
        //后来知道可以redirect重定位指向requestmapping

//        Myblog nblog=myblogService.getallblog(sid);
//
//            String ntext = nblog.getPri_page();
//
//            andView.addObject("ntext", ntext);
//
//        andView.setViewName("myblog");
        return "redirect:/tomyblog";

    }


    @RequestMapping("/editmessage")
    public String editmessage(HttpServletRequest httpServletRequest,
                              HttpServletResponse httpServletResponse, HttpSession session) {
        String  sid=(String)httpServletRequest.getSession().getAttribute("sid");
        String mcontext = httpServletRequest.getParameter("mcontext");
        String acontext=httpServletRequest.getParameter("acontext");
        Message message=new Message();
        message.setId(sid);
        message.setMcontext(mcontext);
        message.setAcontext(acontext);
        System.out.println(message.getAcontext());
        System.out.println(message.getMcontext());

        this.myblogService.updatemessage(message);
        return "redirect:/tomyblog";
    }
    //其他用户访问学生主页界面
    @RequestMapping("/totourmyblog")
    public ModelAndView totourmyblog(Map<String,List<Openblog>> map,HttpServletRequest httpServletRequest,
                                 HttpServletResponse httpServletResponse, HttpSession session){
        ModelAndView andView = new ModelAndView();
        String sid;
        sid=httpServletRequest.getParameter("id");
        System.out.println(sid);
        session.setAttribute("tourid",sid);
        Student student=myblogService.getstudentbysid(sid);     //取学生信息
        String sname=student.getSname();
        andView.addObject("name",sname);
        andView.addObject("id",sid);

        Myblog nblog=myblogService.getallblog(sid);    //取博客信息

        String ntext = nblog.getPri_page();
        andView.addObject("ntext", ntext);
        Message message=myblogService.getallmessage(sid);   //取留言信息
        String mcontext=message.getMcontext();
        String acontext=message.getAcontext();
        andView.addObject("mcontext",mcontext);
        andView.addObject("acontext",acontext);
        andView.setViewName("tour-myblog");

        map.put("allblogs",myblogService.getblogs(sid));    //取帖子信息
        return andView;
    }

    @RequestMapping("/tourmessage")     //游客留言
     public String tourmessage(HttpServletRequest httpServletRequest,
                               HttpServletResponse httpServletResponse, HttpSession session,String id)
    {

       // String  id=(String)httpServletRequest.getSession().getAttribute("tourid");

        String mcontext = httpServletRequest.getParameter("mcontext");

        System.out.println(id+mcontext);
        Message message=new Message();
        message.setId(id);
        message.setMcontext(mcontext);
        session.setAttribute("tourid",id);
        this.myblogService.addtourmeaasage(message);
        return "redirect:/totourmyblog1";
    }

    @RequestMapping("/totourmyblog1")
    public ModelAndView totourmyblog1(Map<String,List<Openblog>> map,HttpServletRequest httpServletRequest,
                                     HttpServletResponse httpServletResponse, HttpSession session){
        ModelAndView andView = new ModelAndView();
        String sid;
        sid= (String) session.getAttribute("tourid");
        System.out.println(sid);
        Student student=myblogService.getstudentbysid(sid);     //取学生信息
        String sname=student.getSname();
        andView.addObject("name",sname);
        andView.addObject("id",sid);

        Myblog nblog=myblogService.getallblog(sid);    //取博客信息

        String ntext = nblog.getPri_page();
        andView.addObject("ntext", ntext);
        Message message=myblogService.getallmessage(sid);   //取留言信息
        String mcontext=message.getMcontext();
        String acontext=message.getAcontext();
        andView.addObject("mcontext",mcontext);
        andView.addObject("acontext",acontext);
        andView.setViewName("tour-myblog");

        map.put("allblogs",myblogService.getblogs(sid));    //取帖子信息
        return andView;
    }
}
