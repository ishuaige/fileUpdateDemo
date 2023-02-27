package com.niuma.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author niumazlb
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {
    @Value("${file.path}")
    private String FILE_PATH;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //所有带/f/ 都认为是静态资源文件
        registry.addResourceHandler("/f/**").addResourceLocations("file:" + FILE_PATH);
        //例如: http://127.0.0.1:8000/f/资源名，就可以看到资源了
    }
}
