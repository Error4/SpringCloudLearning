package com.wyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ServiceConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerApplication.class, args);
    }


    @Bean
    //@LoadBalanced // 负载均衡注解
    //Spring Boot 不提供任何自动配置的RestTemplate bean，所以需要在启动类中注入 RestTemplate
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
