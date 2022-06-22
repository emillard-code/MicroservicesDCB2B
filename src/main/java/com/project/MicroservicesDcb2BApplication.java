package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroservicesDcb2BApplication {

    // Differences from A version (before service registry implementation):
    // @LoadBalanced annotation in MicroservicesDcb2Application.class
    // Changed the below url from localhost to DEPARTMENT-SERVICE
    // restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),Department.class);
    // Added additional details in application.yml file.
    public static void main(String[] args) {

        SpringApplication.run(MicroservicesDcb2BApplication.class, args);

    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {

        return new RestTemplate();

    }

}