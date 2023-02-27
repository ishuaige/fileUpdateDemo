package com.niuma.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 上传到本地
 * @author niuma
 * @create 2023-02-27 20:14
 */
@RestController
@CrossOrigin
@RequestMapping("file")
public class FileController {

    @Value("${file.domain}")
    private String PATH_DOMAIN;

    @Value("${file.path}")
    private String PATH;

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file){
        try {
            // 先创建文件夹
            File fileDir = new File(PATH);
            if(!fileDir.exists()){
                fileDir.mkdirs();
            }
            //获取文件名称
            String fileName = file.getOriginalFilename();
            //添加随机值
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            // 新的随机名字
            fileName = uuid + fileName;
            File newFile = new File(PATH+fileName);
            //上传文件到本地
            file.transferTo(newFile);
            // 供前端访问的路径
            String newFileUrl = PATH_DOMAIN  + fileName;
            return newFileUrl;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
