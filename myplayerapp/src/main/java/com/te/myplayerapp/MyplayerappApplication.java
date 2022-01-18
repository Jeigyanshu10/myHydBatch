package com.te.myplayerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.te.myplayerapp")
public class MyplayerappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyplayerappApplication.class, args);
	}

}
