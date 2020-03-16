 package com.edson.app.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.edson.app.commons.models.entities"})
public class ServicoProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoProdutosApplication.class, args);
	}

}
