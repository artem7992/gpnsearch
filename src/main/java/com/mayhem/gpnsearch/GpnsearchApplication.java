package com.mayhem.gpnsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
@EnableMBeanExport(defaultDomain = "gpnsearch")
public class GpnsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpnsearchApplication.class, args);
	}

}
