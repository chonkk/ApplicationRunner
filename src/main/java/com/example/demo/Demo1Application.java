package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
	@Bean
	public ApplicationRunner applicationRunner(String... args) throws Exception{
		return new ApplicationRunner() {

			@Override
			public void run(ApplicationArguments args) throws Exception {
				log.info("applicationRunner test");
			}
			
		};
		
	}

}
