package com.wyf.springcloud.config;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public RandomRule randomRule() {
        return new RandomRule();
    }
}
