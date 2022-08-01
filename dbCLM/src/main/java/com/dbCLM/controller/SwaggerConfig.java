package com.dbCLM.controller;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@Configuration
@EnableSwagger2
@Component

public class SwaggerConfig {

//	@Bean
//	public Docket swaggerApiConfig() {
//		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any()).apis(RequestHandlerSelectors.any()).build();
//	}

	@Bean
	public GroupedOpenApi swaggerApiConfig() {
		return GroupedOpenApi.builder().build();
	}
}
