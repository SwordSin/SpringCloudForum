package com.street.lamp.customer.service.impl;

import com.street.lamp.customer.service.OperCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OperCustomerServiceImpl implements OperCustomerService {
    @Override
    public String getCustomer() {
        log.info("获取一个customer...");
        return "这是一个customer";
    }
}
