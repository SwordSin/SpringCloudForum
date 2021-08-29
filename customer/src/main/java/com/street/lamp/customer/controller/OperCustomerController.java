package com.street.lamp.customer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequestMapping("/customer")
public class OperCustomerController {
    @ResponseBody
    @GetMapping("/getCustomer")
    public String getCustomer() {
        log.info("获取customer...");
        return "获取customer...";
    }
}
