package com.fse.userprofile.controller;

import com.fse.userprofile.model.User;
import com.fse.userprofile.producer.UserProfileProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/messaging")
public class UserProfileMessageController {
    @Autowired
    private UserProfileProducer producer;
    @RequestMapping("/publish")
    public void postUserProfile(@RequestBody User user){
        producer.sendUserProfile(user);
    }
}
