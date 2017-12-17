package com.loc.study.springboot.app;

import com.loc.study.springboot.app.config.GracefulShutdown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApp.class,args);
    }

    @Bean
    public GracefulShutdown gracefulShutdown(){
        return  new GracefulShutdown();
    }
}
