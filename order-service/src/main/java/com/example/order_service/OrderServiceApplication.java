package com.example.order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8082");
		SpringApplication.run(OrderServiceApplication.class, args);
	}
}