package com.niuma.demo.controller;


import com.niuma.demo.service.OssService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author niumazlb
 */
@CrossOrigin
@RestController
@RequestMapping("/fileOss")
public class OssController {

    @Resource
    private OssService ossService;

    /**
     * 将图片上传到 oss
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public String uploadOssFile(@RequestParam("file") MultipartFile file) {
        //返回上传到oss的路径
        String url = ossService.uploadFileAvatar(file);
        //返回
        return url;
    }

}