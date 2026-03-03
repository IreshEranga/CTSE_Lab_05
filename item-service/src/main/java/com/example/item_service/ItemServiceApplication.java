package com.example.item_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8081");
		SpringApplication.run(ItemServiceApplication.class, args);
	}
}