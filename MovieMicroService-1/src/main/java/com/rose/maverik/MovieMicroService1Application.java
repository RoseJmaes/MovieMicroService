package com.rose.maverik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieMicroService1Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieMicroService1Application.class, args);
	}

	@Bean	
	public 	RestTemplate resttemplate() {
	return new RestTemplate();
	}


}
