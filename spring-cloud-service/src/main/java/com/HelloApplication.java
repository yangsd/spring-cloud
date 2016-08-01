package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 创建“服务提供方”
 * Created by sdyang on 2016/8/1.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        System.out.println("**********  服务开始启动  **********");
        new SpringApplicationBuilder(HelloApplication.class).web(true).run(args);
        System.out.println("**********  服务启动完成  **********");
    }

}
