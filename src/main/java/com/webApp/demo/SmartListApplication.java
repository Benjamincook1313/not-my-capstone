package com.webApp.demo;

import com.webApp.demo.repository.SpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartListApplication  implements CommandLineRunner {

//	Logger logger = new LoggerFacotory.getLogger(this.getClass());

	@Autowired
	SpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SmartListApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

//		logger.info

	}
}
