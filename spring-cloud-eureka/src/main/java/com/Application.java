package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 使用Eureka创建“服务注册中心”
 * 启动后访问http://localhost:1111/
 * Created by sdyang on 2016/8/1.
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("**********  服务注册中心开始启动  **********");
        new SpringApplicationBuilder(Application.class).web(true).run(args);
        System.out.println("**********  服务注册中心启动完成  **********");
    }

}