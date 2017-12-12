package com.example.smsservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SmsController {

    @RequestMapping(value = "/send/{msg}", method = RequestMethod.GET)
    public String send(@PathVariable("msg") String msg){
        return "send message:" + msg;
    }

    @RequestMapping(value = "/dosend", method = RequestMethod.GET)
    public String testsend(@RequestParam("msg") String msg){
        return "dosend message:" + msg;
    }
}
