package com.example.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/ti")
    public String hi(){
        return foo;
    }
}
