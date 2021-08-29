package com.street.lamp.message.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Controller
@RequestMapping("/message")
public class MessageController {
    private final String CUSTOMER_URL = "http://localhost:8101";

    @Resource
    RestTemplate restTemplate;

    @ResponseBody
    @GetMapping("/getMessage")
    public String getMessage() {
        return restTemplate.getForObject(CUSTOMER_URL + "/customer/getCustomer", String.class);
    }

    @ResponseBody
    @GetMapping("/getMessage2")
    public String getMessage2() {
        return "ceshi";
    }
}
