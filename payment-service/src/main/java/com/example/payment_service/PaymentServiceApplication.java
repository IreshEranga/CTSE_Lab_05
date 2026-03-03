package com.example.payment_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8083");
		SpringApplication.run(PaymentServiceApplication.class, args);
	}
}