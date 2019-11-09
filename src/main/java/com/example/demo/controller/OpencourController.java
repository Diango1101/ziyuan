package com.example.demo.controller;

import com.example.demo.entity.Teacherclass;
import com.example.demo.service.OpencourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class OpencourController {
    @Autowired
    private OpencourService opencourService;

    @RequestMapping("/opencour")
    public String  opencourse(HttpServletRequest request, Model model,
                              @RequestAttribute("ppt") MultipartFile ppt,
                               @RequestAttribute("processchart") MultipartFile processchart,
                              @RequestAttribute("outline") MultipartFile outline,
                               @RequestAttribute("exinstruct") MultipartFile exinstruct)
            throws IllegalStateException, IOException {
        String tid = (String) request.getSession().getAttribute("tid");
        String cid=request.getParameter("cid");
        String cname=request.getParameter("cname");
        String label=request.getParameter("label");
        String pptin=ppt.getOriginalFilename();
        String processchartin=processchart.getOriginalFilename();
        String outlinein=outline.getOriginalFilename();
        String exinstructin=exinstruct.getOriginalFilename();
        opencourService.addtc(tid,cid);

        String path = "F:\\IntelliJ IDEA2018\\ziyuandata";
        ppt.transferTo(new File(path + File.separator + pptin));
        processchart.transferTo(new File(path + File.separator + processchartin));
        outline.transferTo(new File(path + File.separator + outlinein));
        exinstruct.transferTo(new File(path + File.separator + exinstructin));

        opencourService.addppt(cid,pptin);
        opencourService.addcourse(cid,cname,label,processchartin,outlinein,exinstructin);

        return "index-t";
    }

}
