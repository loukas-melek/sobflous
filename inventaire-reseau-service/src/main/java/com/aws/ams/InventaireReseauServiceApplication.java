package com.aws.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class InventaireReseauServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventaireReseauServiceApplication.class, args);
	}

}
