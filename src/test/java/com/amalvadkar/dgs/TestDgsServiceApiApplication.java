package com.amalvadkar.dgs;

import org.springframework.boot.SpringApplication;

public class TestDgsServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(DgsServiceApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
