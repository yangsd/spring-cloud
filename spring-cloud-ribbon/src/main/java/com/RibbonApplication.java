package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Ribbon是一个基于HTTP和TCP客户端的负载均衡器。Feign中也使用Ribbon。
 * Ribbon可以在通过客户端中配置的ribbonServerList服务端列表去轮询访问以达到均衡负载的作用。
 * 当Ribbon与Eureka联合使用时，ribbonServerList会被DiscoveryEnabledNIWSServerList重写，扩展成从Eureka注册中心中获取服务端列表。
 * 同时它也会用NIWSDiscoveryPing来取代IPing，它将职责委托给Eureka来确定服务端是否已经启动。
 *
 * Created by sdyang on 2016/8/1.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker //开启断路器功能
public class RibbonApplication {

    @Bean
    @LoadBalanced//负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        System.out.println("**********  Ribbon服务开始启动  **********");
        SpringApplication.run(RibbonApplication.class, args);
        System.out.println("**********  Ribbon服务启动完成  **********");
    }

}
