package com.example.test.sslclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.test.sslclient.config.EspnSundayGamesList;

@SpringBootApplication
public class SslclientApplication {

	@Autowired
	EspnSundayGamesList espnSundayGamesList;

	public static void main(String[] args) {
		SpringApplication.run(SslclientApplication.class, args);
	}
}
