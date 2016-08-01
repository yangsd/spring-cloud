package com.service;

import com.service.impl.HelloClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sdyang on 2016/8/1.
 */
@FeignClient(value = "hello-service", fallback = HelloClientHystrix.class)
public interface HelloClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String  hello(@RequestParam(value = "name") String name);
}
