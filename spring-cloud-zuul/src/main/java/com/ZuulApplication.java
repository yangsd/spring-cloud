package com;

import com.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * 服务网关是微服务架构中一个不可或缺的部分。
 * 通过服务网关统一向外系统提供REST API的过程中，除了具备服务路由、均衡负载功能之外，它还具备了权限控制等功能。
 * Spring Cloud Netflix中的Zuul就担任了这样的一个角色，为微服务架构提供了前门保护的作用，
 * 同时将权限控制这些较重的非业务逻辑内容迁移到服务路由层面，使得服务集群主体能够具备更高的可复用性和可测试性。
 *
 * 不仅仅实现了路由功能来屏蔽诸多服务细节，更实现了服务级别、均衡负载的路由。
 * 实现了接口权限校验与微服务业务逻辑的解耦。通过服务网关中的过滤器，在各生命周期中去校验请求的内容，将原本在对外服务层做的校验前移，保证了微服务的无状态性，同时降低了微服务的测试难度，让服务本身更集中关注业务逻辑的处理。
 * 实现了断路器，不会因为具体微服务的故障而导致服务网关的阻塞，依然可以对外服务
 *
 * Created by sdyang on 2016/8/1.
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {

    public static void main(String[] args) {
        System.out.println("**********  Zuul网关服务开始启动  **********");
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
        System.out.println("**********  Zuul网关服务启动完成  **********");
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
