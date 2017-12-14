package com.loc.study.springboot.app.controller;

import com.loc.study.springboot.app.config.CloudConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping(value = "/cloud/config")
@EnableConfigurationProperties(CloudConfig.class)
public class CloudConfigController {

    @Autowired
    private CloudConfig cloudConfig;

    @Value(value = "${loc.cloud.controller.param3}")
    private String param3;

    @GetMapping(value = "/configParam1")
    public String getConfig1(){
        return cloudConfig.getParam1();
    }

    @GetMapping(value = "/configParam2")
    public int getConfig2(){
        return cloudConfig.getParam2();
    }

    @GetMapping(value = "/configParam3")
    public String getConfig3(){
        return param3;
    }

}
