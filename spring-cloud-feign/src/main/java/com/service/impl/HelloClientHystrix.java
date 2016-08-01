package com.service.impl;

import com.service.HelloClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sdyang on 2016/8/1.
 */
@Component
public class HelloClientHystrix implements HelloClient{
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "error";
    }
}
