package com.example.smsservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SmsController {

    @RequestMapping(value = "/send/{msg}", method = RequestMethod.GET)
    public String send(@PathVariable("msg") String msg){
        return "send message:" + msg;
    }
}
