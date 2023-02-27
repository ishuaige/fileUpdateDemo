package com.niuma.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author niumazlb
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.niuma"})
public class FileUpdateDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileUpdateDemoApplication.class, args);
    }

}
