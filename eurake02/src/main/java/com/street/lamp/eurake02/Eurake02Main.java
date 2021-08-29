package com.street.lamp.eurake02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurake02Main {
    public static void main(String[] args) {
        SpringApplication.run(Eurake02Main.class);
    }
}
