package com.fse.userprofile.producer;

import com.fse.userprofile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserProfileProducer {
    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;
    @Value("${spring.kafka.topic}")
    private String topic;

    public void sendUserProfile(User user){
        kafkaTemplate.send(this.topic,user);
    }
}