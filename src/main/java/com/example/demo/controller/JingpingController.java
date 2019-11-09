package com.example.demo.controller;

import com.example.demo.entity.Jingping;
import com.example.demo.service.JingpingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
@Controller
public class JingpingController {
    @Autowired
    private JingpingService jingpingService;

    @RequestMapping("/showjingping")
    public String Showjingping(Map<String, List<Jingping>> map, HttpServletRequest httpServletRequest)
    {
         map.put("jingpings",jingpingService.getJingping());
        return "jingping";
    }

//    @RequestMapping("/QueryByTime")
//    public String  QueryByTime(Map<String, List<Query>> map){
//        map.put("qbClicks",queryService.getAllByTime());
//        return "query";
//    }
}
