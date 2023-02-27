package com.niuma.demo.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author niumazlb
 */
public interface OssService {
    /**
     * 上传头像到OSS
     * @param file
     * @return
     */
    String uploadFileAvatar(MultipartFile file);

}