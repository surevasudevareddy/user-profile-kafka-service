package com.fse.userprofile.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configs {
    @Value("${spring.mongo.service.url}")
    public static String kafkaServiceUrl;
}
