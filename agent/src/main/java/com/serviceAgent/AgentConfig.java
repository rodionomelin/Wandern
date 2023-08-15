package com.serviceAgent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AgentConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}