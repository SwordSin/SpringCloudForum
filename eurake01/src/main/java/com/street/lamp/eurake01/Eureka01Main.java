package com.street.lamp.eurake01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka01Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureka01Main.class);
    }
}
