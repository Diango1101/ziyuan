package com.example.demo.controller;

import com.example.demo.entity.Mycour;
import com.example.demo.service.CoursemanageService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

@Controller
public class CoursemanageController {
    @Autowired
    private CoursemanageService coursemanageService;

    @RequestMapping("/getaverage")
    public String getaverage(HttpServletRequest httpServletRequest){

        String cid=httpServletRequest.getParameter("cid");
        float average=coursemanageService.getaver(cid);
        httpServletRequest.setAttribute("grade",average);

        return "coursemanage";
    }
    @RequestMapping("/tomanagement")
    public String tomanagement(Map<String, List<Mycour>> map,HttpServletRequest httpServletRequest){
            String tid=(String)httpServletRequest.getSession().getAttribute("tid");
            map.put("Allcourses",coursemanageService.getallcours(tid));
            return "coursemanage";
    }

    @RequestMapping("/setgrade")
    public String setgrade(HttpServletRequest httpServletRequest){
         String cid=httpServletRequest.getParameter("Cid");
         String sid=httpServletRequest.getParameter("Sid");
         Float grade=Float.parseFloat(httpServletRequest.getParameter(sid+cid+"coursegrade"));
     coursemanageService.setgrade(grade,cid,sid);
        return "redirect:/getaverage";
    }

    @RequestMapping("/getallstu")
    public String getstu(Map<String, List<Mycour>> map,HttpServletRequest httpServletRequest){
        String cid=httpServletRequest.getParameter("cidtostu");
        System.out.println(cid);
        map.put("Allstus",coursemanageService.getallstus(cid));
//       System.out.println(coursemanageService.getallstus(cid).get(0).getWork_word());
        return "coursemanage";
    }
    @RequestMapping("/Download")
    public ResponseEntity<byte[]> download(HttpServletRequest request,
                                           @RequestParam("filename") String filename,
                                           @RequestHeader("User-Agent") String userAgent
    )throws Exception{
        // 下载文件路径
        String path = "F:\\IntelliJ IDEA2018\\ziyuandata";
        // 构建File
        File file = new File(path+File.separator+ filename);
        // ok表示Http协议中的状态 200
        ResponseEntity.BodyBuilder builder = ResponseEntity.ok();
        // 内容长度
        builder.contentLength(file.length());
        // application/octet-stream ： 二进制流数据（最常见的文件下载）。
        builder.contentType(MediaType.APPLICATION_OCTET_STREAM);
        // 使用URLDecoder.decode对文件名进行解码
        filename = URLEncoder.encode(filename, "UTF-8");
        // 设置实际的响应文件名，告诉浏览器文件要用于【下载】、【保存】attachment 以附件形式
        // 不同的浏览器，处理方式不同，要根据浏览器版本进行区别判断
        if (userAgent.indexOf("MSIE") > 0) {
            // 如果是IE，只需要用UTF-8字符集进行URL编码即可
            builder.header("Content-Disposition", "attachment; filename=" + filename);
        } else {
            // 而FireFox、Chrome等浏览器，则需要说明编码的字符集
            // 注意filename后面有个*号，在UTF-8后面有两个单引号！
            builder.header("Content-Disposition", "attachment; filename*=UTF-8''" + filename);
        }
        return builder.body(FileUtils.readFileToByteArray(file));
    }
    @RequestMapping("/Downloadcode")
    public ResponseEntity<byte[]> downloadcode(HttpServletRequest request,
                                           @RequestParam("filename") String filename,
                                           @RequestHeader("User-Agent") String userAgent
    )throws Exception{
        // 下载文件路径
        String path = "F:\\IntelliJ IDEA2018\\ziyuandata\\Code";
        // 构建File
        File file = new File(path+File.separator+ filename);
        // ok表示Http协议中的状态 200
        ResponseEntity.BodyBuilder builder = ResponseEntity.ok();
        // 内容长度
        builder.contentLength(file.length());
        // application/octet-stream ： 二进制流数据（最常见的文件下载）。
        builder.contentType(MediaType.APPLICATION_OCTET_STREAM);
        // 使用URLDecoder.decode对文件名进行解码
        filename = URLEncoder.encode(filename, "UTF-8");
        // 设置实际的响应文件名，告诉浏览器文件要用于【下载】、【保存】attachment 以附件形式
        // 不同的浏览器，处理方式不同，要根据浏览器版本进行区别判断
        if (userAgent.indexOf("MSIE") > 0) {
            // 如果是IE，只需要用UTF-8字符集进行URL编码即可
            builder.header("Content-Disposition", "attachment; filename=" + filename);
        } else {
            // 而FireFox、Chrome等浏览器，则需要说明编码的字符集
            // 注意filename后面有个*号，在UTF-8后面有两个单引号！
            builder.header("Content-Disposition", "attachment; filename*=UTF-8''" + filename);
        }
        return builder.body(FileUtils.readFileToByteArray(file));
    }

}
