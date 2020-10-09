package com.wang.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    //注册RestTemplate
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}