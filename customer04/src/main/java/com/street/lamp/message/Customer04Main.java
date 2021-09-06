package com.street.lamp.message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Customer04Main {
    public static void main(String[] args) {
        SpringApplication.run(Customer04Main.class);
    }
}
