package com.jacques.target;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.jacques.target.interceptor.HeaderInterceptor;

@Configuration
public class TargetApplicationConfig {

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setInterceptors(Collections.singletonList(new HeaderInterceptor()));
		return restTemplate;
	}
}
