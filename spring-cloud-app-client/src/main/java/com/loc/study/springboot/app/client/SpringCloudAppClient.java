package com.loc.study.springboot.app.client;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by weylan on 2017/12/17.
 */
@SpringCloudApplication
@EnableFeignClients
public class SpringCloudAppClient {


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAppClient.class, args);
    }


}
