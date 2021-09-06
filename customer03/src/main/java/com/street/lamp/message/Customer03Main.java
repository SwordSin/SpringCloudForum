package com.street.lamp.message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Customer03Main {
    public static void main(String[] args) {
        SpringApplication.run(Customer03Main.class);
    }
}
