package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Feign��һ������ʽ��Web Service�ͻ��ˣ���ʹ�ñ�дWeb Serivce�ͻ��˱�ø��Ӽ򵥡�
 * ����ֻ��Ҫʹ��Feign������һ���ӿڲ���ע�����������ȿ���ɡ����߱��ɲ�ε�ע��֧�֣�����Feignע���JAX-RSע�⡣
 * FeignҲ֧�ֿɲ�εı������ͽ�������
 * Spring CloudΪFeign�����˶�Spring MVCע���֧�֣���������Ribbon��Eureka���ṩ���⸺�ص�HTTP�ͻ���ʵ�֡�
 * Created by sdyang on 2016/8/1.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {

    public static void main(String[] args) {
        System.out.println("**********  Feign����ʼ����  **********");
        SpringApplication.run(FeignApplication.class, args);
        System.out.println("**********  Feign�����������  **********");
    }

}
