package com.example.demo.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.example.demo.conf.WebSecurityConfig;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.service.LoginService;
import com.example.demo.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.code.kaptcha.impl.DefaultKaptcha;

@Controller
public class KaptchaController  {


    @Autowired
    private LoginService loginservice;

    /**
     * 1、验证码工具
     */
    @Autowired
    DefaultKaptcha defaultKaptcha;

    /**
     * 2、生成验证码
     * @param httpServletRequest
     * @param httpServletResponse
     * @throws Exception
     */
    @RequestMapping("/defaultKaptcha")
    public void defaultKaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws Exception {
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            // 生产验证码字符串并保存到session中
            String createText = defaultKaptcha.createText();
            httpServletRequest.getSession().setAttribute("rightCode", createText);
            // 使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        // 定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream = httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }

    /**
     * 3、校对验证码
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     */
    @RequestMapping("/imgvrifyControllerDefaultKaptcha")
    public ModelAndView imgvrifyControllerDefaultKaptcha(HttpServletRequest httpServletRequest,
                                                         HttpServletResponse httpServletResponse, HttpSession session) {
        ModelAndView andView = new ModelAndView();
        String rightCode = (String) httpServletRequest.getSession().getAttribute("rightCode");
        String tryCode = httpServletRequest.getParameter("tryCode");
        String id = httpServletRequest.getParameter("id");
        String pwd = httpServletRequest.getParameter("password");
        String type= httpServletRequest.getParameter("gettype");
        Student student = new Student();
        Teacher teacher=new Teacher();
        teacher.setTid(id);
        teacher.setTpwd(pwd);
        student.setSid(id);
        student.setSpwd(pwd);
        boolean verify1 =loginservice.verifyStudentLogin(student);

        boolean verify2 =loginservice.verifyTeacherLogin(teacher);

        System.out.println("rightCode:"+rightCode+" ———— tryCode:"+tryCode);

        if (!rightCode.equals(tryCode ) ) {
            andView.addObject("info", "错误的验证码");
            andView.setViewName("login");
        }
        if (rightCode.equals(tryCode  )&& verify1 && type.equals("student") )
        {
            String  sname=loginservice.selectStudentName(student);
//            session=httpServletRequest.getSession();
            session.setAttribute("sid",id);
            session.setAttribute(WebSecurityConfig.SESSION_KEY, id);
            andView.addObject("sname", sname);
//            andView.addObject("sid", id);
            andView.setViewName("index-s");
        }
        if (rightCode.equals(tryCode  )&& verify2 && type.equals("teacher") )
        {
            String tname=loginservice.selectTeacherName(teacher);
            session.setAttribute("tid",id);
            session.setAttribute(WebSecurityConfig.SESSION_KEY, id);
            andView.addObject
                    ("tname", tname);
            andView.addObject("tid", id);
            andView.setViewName("index-t");
        }
        if (rightCode.equals(tryCode  )&&  type.equals("admin") && id.equals("admin") && pwd.equals("fvgscd") )
        {

            session.setAttribute(WebSecurityConfig.SESSION_KEY, id);
            andView.addObject("info", "登录成功");
            andView.setViewName("index-admin");
        }
        return andView;
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/login";
    }
    @GetMapping("/")
    public String reout(HttpSession session){
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/index";
    }

}

