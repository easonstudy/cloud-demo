package com.example.feginservice.controller;

import com.example.feginservice.service.SmsRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginController {
    @Autowired
    SmsRemote smsRemote;

    @RequestMapping("/hi/{msg}")
    public String index(@PathVariable("msg") String msg) {
        return smsRemote.send(msg);
    }
}
