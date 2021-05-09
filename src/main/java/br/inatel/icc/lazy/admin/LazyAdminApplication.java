package br.inatel.icc.lazy.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class LazyAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazyAdminApplication.class, args);
	}
}
