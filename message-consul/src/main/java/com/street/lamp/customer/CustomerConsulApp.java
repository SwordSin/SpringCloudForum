package com.street.lamp.customer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerConsulApp {
    public static void main(String[] args) {
        SpringApplication.run(CustomerConsulApp.class, args);
    }
}