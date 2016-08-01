package com.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 在Spring Cloud中使用了Hystrix 来实现断路器的功能。
 * Hystrix是Netflix开源的微服务框架套件之一，该框架目标在于通过控制那些访问远程系统、服务和第三方库的节点，从而对延迟和故障提供更强大的容错能力。
 * Hystrix具备拥有回退机制和断路器功能的线程和信号隔离，请求缓存和请求打包，以及监控和配置等功能。
 *
 * Created by sdyang on 2016/8/1.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloServiceFallback")
    public String helloService() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello?name=sdyang", String.class).getBody();
    }

    public String helloServiceFallback() {
        return "error";
    }

}
