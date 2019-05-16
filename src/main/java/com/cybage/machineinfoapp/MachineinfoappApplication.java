package com.cybage.machineinfoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MachineinfoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MachineinfoappApplication.class, args);
		//System.getProperty("os.name");
		System.out.println("Operating System "+System.getProperty("os.name"));
	}

}
