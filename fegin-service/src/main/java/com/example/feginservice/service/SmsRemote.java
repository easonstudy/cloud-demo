package com.example.feginservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sms-service")
public interface SmsRemote {

    @RequestMapping(value = "/send")
    public String send(@RequestParam(value = "msg") String msg);

}
