 package com.edson.app.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServicoProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoProdutosApplication.class, args);
	}

}
