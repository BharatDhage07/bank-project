package com.bank.locker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = {"com.bank.locker"})
public class LockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LockerApplication.class, args);
	}
}
