package com.docker.database.dockerpostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DockerPostgresApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(DockerPostgresApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerPostgresApplication.class, args);
	}
}
