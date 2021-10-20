package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@SpringBootConfiguration
@Configuration

public class SpringBatchXmlToDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchXmlToDbApplication.class, args);
	}

}
