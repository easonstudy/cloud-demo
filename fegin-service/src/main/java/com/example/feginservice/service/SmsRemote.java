package com.example.feginservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value="sms-service", fallback = SmsRemoteImpl.class)
public interface SmsRemote {

    @RequestMapping(value = "/send/{msg}")
    public String send(@RequestParam(value = "msg") String msg);

    @RequestMapping(value = "/send")
    public String dosend(@RequestParam(value = "msg") String msg);
}
