package com.qrn.pruebaTecnicaQaroni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class PruebaTecnicaQaroniApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaTecnicaQaroniApplication.class, args);
	}

}
