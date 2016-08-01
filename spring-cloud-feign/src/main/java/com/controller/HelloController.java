package com.controller;

import com.service.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdyang on 2016/8/1.
 */
@RestController
public class HelloController {

    @Autowired
    HelloClient helloClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return helloClient.hello("sdyang");
    }

}