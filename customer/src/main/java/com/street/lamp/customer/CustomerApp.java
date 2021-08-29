package com.street.lamp.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// DataSourceAutoConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CustomerApp {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApp.class);
    }
}
