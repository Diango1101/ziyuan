package com.example.demo.controller;

import com.example.demo.entity.Query;
import com.example.demo.service.QueryService;
import com.example.demo.service.impl.QueryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class QueryController {
    @Autowired
    private QueryServiceImpl queryService;

    @RequestMapping("/QueryByClick")
    public String  QueryByClick(Map<String, List<Query>> map){
        map.put("qbClicks",queryService.getAllByClick());
        return "query";
    }
    @RequestMapping("/QueryByTime")
    public String  QueryByTime(Map<String, List<Query>> map){
        map.put("qbClicks",queryService.getAllByTime());
        return "query";
    }
    @RequestMapping("/QueryByName")
    public String  QueryByName(Map<String, List<Query>> map,HttpServletRequest httpServletRequest){
        String Cname=httpServletRequest.getParameter("Cname");
        System.out.println(Cname);
        map.put("qbClicks",queryService.getAllByName("%"+Cname+"%"));
        return "query";
    }
    @RequestMapping("/QueryByLabel")
    public String QuertByLabel(Map<String, List<Query>> map,HttpServletRequest httpServletRequest){
        String Label=httpServletRequest.getParameter("Label");
        map.put("qbClicks",queryService.getAllByLabel(Label));
        return "query";
    }
    @RequestMapping("/SelectLabel")
    public String SelectLabel(Map<String, List<String>> map) {
        map.put("qbLabels", queryService.getLabel());
        return "query2";
    }
    @RequestMapping("/ChooseCour")
    public String ChooseCour(HttpServletRequest httpServletRequest, HttpSession session,String Cid){
        String Sid= (String) httpServletRequest.getSession().getAttribute("sid");
        System.out.println(Sid);
        System.out.println(Cid);
        queryService.chooseCour(Sid,Cid);
        return "redirect:/QueryByClick-s";
    }
    @RequestMapping("/QueryByClick-s")
    public String  QueryByClicks(Map<String, List<Query>> map){
        map.put("qbClicks",queryService.getAllByTime());//原本名字下是Click，现在改成Time
        return "query-s";
    }
    @RequestMapping("/SelectLabel-s")
    public String SelectLabels(Map<String, List<String>> map) {
        map.put("qbLabels", queryService.getLabel());
        return "query2-s";
    }
    @RequestMapping("/QueryByName-s")
    public String  QueryByNames(Map<String, List<Query>> map,HttpServletRequest httpServletRequest){
        String Cname=httpServletRequest.getParameter("Cname");
        System.out.println(Cname);
        map.put("qbClicks",queryService.getAllByName("%"+Cname+"%"));
        return "query-s";
    }
    @RequestMapping("/QueryByLabel-s")
    public String QuertByLabels(Map<String, List<Query>> map,HttpServletRequest httpServletRequest){
        String Label=httpServletRequest.getParameter("Label");
        map.put("qbClicks",queryService.getAllByLabel(Label));
        return "query-s";
    }

    @RequestMapping("/QueryByTime-a")
    public String  QueryByTimea(Map<String, List<Query>> map){
        map.put("qbClicks",queryService.getAllByTimea());
        map.put("qbClick1s",queryService.getAllByTimead());
        return "query-a";
    }
}
