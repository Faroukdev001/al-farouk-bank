package com.faroukdev.alfaroukbank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "AL-Farouk Bank App",
				description = "Backend Rest APIs for AF Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Arogundade Farouk",
						email = "arogundadefarouk@gmail.com",
						url = "https://github.com/faroukdev001"
				),
				license = @License(
						name = "The TechTide",
						url = "https://github.com/faroukdev001"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Al-Farouk Bank App Documentation",
				url = "https://github.com/faroukdev001"
		)
)
public class AlFaroukBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlFaroukBankApplication.class, args);
	}

}
