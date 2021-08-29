package com.street.lamp.message;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MessageApp {
    public static void main(String[] args) {
        SpringApplication.run(MessageApp.class);
    }
}
