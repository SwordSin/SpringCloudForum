package com.street.lamp.message;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MessageRibbonApp {
    public static void main(String[] args) {
        SpringApplication.run(MessageRibbonApp.class, args);
    }
}
