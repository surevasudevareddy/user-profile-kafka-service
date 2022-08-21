package com.fse.userprofile.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configs {
    @Value("${mongo.service.url}")
    public String kafkaServiceUrl;
}
