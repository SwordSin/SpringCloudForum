package com.street.lamp.message.controller;

import com.street.lamp.message.service.impl.OperCustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/customer")
public class OperCustomerController {
    @Resource
    OperCustomerServiceImpl operCustomerService;

    @ResponseBody
    @GetMapping("/getCustomer")
    public String getCustomer() {
        return operCustomerService.getCustomer();
    }
}
