package com.example.demo.controller;

import com.example.demo.entity.Mycour;
import com.example.demo.service.MycourService;
import org.apache.commons.io.FileUtils;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

@Controller
public class MycourController {
    @Autowired
    private MycourService mycourService;
    private Mycour mycour=new Mycour();
    @RequestMapping("/GetMyCour")
    public String getMycour(Map<String, List<Mycour>> map, HttpSession session, HttpServletRequest httpServletRequest) {
        String context = (String) httpServletRequest.getSession().getAttribute("sid");
        // System.out.println(context);
        // System.out.println(mycourService.getAllCour(context).get(0).getCid());
        map.put("Mycours", mycourService.getAllCour(context));
        System.out.println(mycourService.getAllCour(context).get(0).getWork_word());
        return "mycour";
    }

    @RequestMapping("/Upload")
    public String upload(HttpServletRequest request, Model model,@RequestAttribute("Word") MultipartFile Word,@RequestAttribute("Code") MultipartFile Code) throws IllegalStateException, IOException {
        String context = (String) request.getSession().getAttribute("sid");
        System.out.println(context);
        String Cid = request.getParameter("Cid");
        System.out.println(Cid);
        String Work_word;
        Work_word = Word.getOriginalFilename();
        if (Work_word.isEmpty())
            Work_word=request.getParameter("Work_word");

        String Work_code;
        Work_code=Code.getOriginalFilename();
        if (Work_code.isEmpty()) {
            Work_code = request.getParameter("Work_code");

        }
        System.out.println(Work_word+context+Cid);
        System.out.println(Work_code);
        mycourService.addWord(context, Cid, Work_word,Work_code);
//        mycourService.addWord1(context,Cid);
        if (!Word.isEmpty()) {
            String path = "F:\\IntelliJ IDEA2018\\ziyuandata";
            /*request.getServletContext().getRealPath("/upload");*/
            String fileName = Word.getOriginalFilename();
            File filePath = new File(path, fileName);
            if (!filePath.getParentFile().exists()) {
                filePath.getParentFile().mkdirs();
            }
            System.out.println(path);
            Word.transferTo(new File(path + File.separator + fileName));

            model.addAttribute("MycourUp",mycour);
        }
        if (!Code.isEmpty()) {
            String path = "F:\\IntelliJ IDEA2018\\ziyuandata\\Code";
            /*request.getServletContext().getRealPath("/upload");*/
            String fileName = Code.getOriginalFilename();
            File filePath = new File(path, fileName);
            if (!filePath.getParentFile().exists()) {
                filePath.getParentFile().mkdirs();
            }
            System.out.println(path);
            Code.transferTo(new File(path + File.separator + fileName));

            model.addAttribute("MycourUp",mycour);
        }
        return "redirect:/GetMyCour";
    }

    @RequestMapping("/SelectWho")
    public String getByCid(Map<String, List<Mycour>> map,String context){
        System.out.println(context);
        map.put("sbCids",mycourService.getAllStu(context));
        System.out.println(mycourService.getAllStu(context).size());
        return "selectwho";
    }

//        @RequestMapping("/UploadCode")
//    public String uploadCode(HttpServletRequest request, Model model,@RequestAttribute("Code") MultipartFile Code) throws IllegalStateException, IOException {
//        String context = (String) request.getSession().getAttribute("sid");
//        System.out.println(context);
//        String Cid = request.getParameter("Cid");
//        System.out.println(Cid);
//        String Work_code = Code.getOriginalFilename();
//        System.out.println(Work_code);
//        mycourService.addCode(context, Cid, Work_code);
//        mycour.setCid(Cid);
//        mycour.setSid(context);
//        mycour.setWork_code(Work_code);
//        if (!Code.isEmpty()) {
//            String path = "E:\\Eclipse\\成平\\demo5\\Code";
//            /*request.getServletContext().getRealPath("/upload");*/
//            String fileName = Code.getOriginalFilename();
//            File filePath = new File(path, fileName);
//            if (!filePath.getParentFile().exists()) {
//                filePath.getParentFile().mkdirs();
//            }
//            System.out.println(path);
//            Code.transferTo(new File(path + File.separator + fileName));
//
//            model.addAttribute("MycourUp",mycour);
//        }
//        return "redirect:/GetMyCour";
//    }
   /**
     * @param request
     * @param filename
     * @param userAgent
     * @return
     * @throws Exception
     */
    @RequestMapping("/DownloadPpt")
    public ResponseEntity<byte[]> download(HttpServletRequest request,
                                           @RequestParam("filename") String filename,
                                           @RequestHeader("User-Agent") String userAgent
                                           )throws Exception{
        // 下载文件路径
        String path = "F:\\IntelliJ IDEA2018\\ziyuandata";
        // 构建File
        File file = new File(path+File.separator+ filename);
        // ok表示Http协议中的状态 200
        BodyBuilder builder = ResponseEntity.ok();
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