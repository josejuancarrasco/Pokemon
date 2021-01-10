package com.example.demo.config;

import javax.sql.DataSource;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	@Bean
	public RestTemplate restTemplate() {

		HttpComponentsClientHttpRequestFactory clientHttp = new HttpComponentsClientHttpRequestFactory(
				HttpClientBuilder.create().build());

		RestTemplate restTemplate = new RestTemplate(clientHttp);
		return restTemplate;
	}
	@Bean
	public DataSource getDatasource() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		
		dataSourceBuilder.driverClassName("org.h2.Driver");
		dataSourceBuilder.url("jdbc:h2:mem:test");
		dataSourceBuilder.username("SA");
		dataSourceBuilder.password("");
		
		return dataSourceBuilder.build();
	}
}
