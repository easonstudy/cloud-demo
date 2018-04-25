package com.example.order.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order")
    @HystrixCommand(fallbackMethod = "hiError")
    public String order() {
        return "order service";
    }

    public String hiError() {
        return "order sorry";
    }
}
