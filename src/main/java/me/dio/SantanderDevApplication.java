package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(servers={@Server(url="/", description = "Defailt Server URL")})
@SpringBootApplication
public class SantanderDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevApplication.class, args);
	}

}
