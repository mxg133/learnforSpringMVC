package com.DanceBytes.fileController;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.util.UUID;

/**
 * @author 孟享广
 * @date 2020-11-20 4:43 下午
 * @description
 */

@Controller
public class TestUpdateAndController {

    @RequestMapping("/down")
    public ResponseEntity<byte[]> download(HttpSession session) throws Exception {
        //获取下载文件的路径
        String path = session.getServletContext().getRealPath("img");// /img/*
        //服务器的文件
//        String finalPath = path + File.separator + "2.jpg";
        String finalPath = path + File.separator + URLEncoder.encode("2.jpg", "utf-8");
        FileInputStream is = new FileInputStream(finalPath);
        //is.available()获取输入流表示的文件的最大字节数
        byte[] bytes = new byte[is.available()];
        is.read(bytes);
        HttpHeaders headers = new HttpHeaders();//http头信息
        //下载的文件的名字
//        headers.add("Content-Disposition", "attachment; filename=" + "1.jpg");
        headers.add("Content-Disposition", "attachment; filename=" + URLEncoder.encode("美利坚1.jpg", "utf-8"));
        HttpStatus statusCode = HttpStatus.OK;//200
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(bytes, headers, statusCode);
        return entity;
    }

    @RequestMapping(value = "up", method = RequestMethod.POST)
    private String upload(String desc, MultipartFile uploadFile[], HttpSession session) throws Exception {
        for (int i = 0; i < uploadFile.length; i++) {
            //获取上传文件的名称
            String fileName = uploadFile[i].getOriginalFilename();
            //解决上传重名的问题
            String finalFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));
            //获取下载文件的路径
            String path = session.getServletContext().getRealPath("photo") + File.separator + finalFileName;
            File file = new File(path);
            uploadFile[i].transferTo(file);
        }
        return "success";
    }
}
