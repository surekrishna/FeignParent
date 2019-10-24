package com.example.FeignParent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignParentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignParentApplication.class, args);
	}

}
