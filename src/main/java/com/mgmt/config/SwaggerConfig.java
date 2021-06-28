package com.mgmt.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import io.swagger.models.Contact;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@SuppressWarnings("unchecked")
	@Bean
	public Docket swagConfig() {
		 return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis((Predicate<RequestHandler>) RequestHandlerSelectors.basePackage("com.mgmt"))
	                .build()
	                .apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {
		return new ApiInfo("User Management REST API",
				"Documentation for the user Management Application",
				"1.0",
				"Terms & Conditions",
				new springfox.documentation.service.Contact("Deepak kumar", "xdeepakkumar.com", "xdeepakkumar355@gmail.com"),
				"userManagement Licence",
				"https://deepak.com",
				new ArrayList<>()
				);
	}
}


