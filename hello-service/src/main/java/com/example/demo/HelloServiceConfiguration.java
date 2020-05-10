package com.example.demo;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
@EnableDiscoveryClient
public class HelloServiceConfiguration {
	
	@Bean
	public IRule iRule() {
		return new RandomRule();
	}
	
}
