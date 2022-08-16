package com.fse.userprofile.consumer;

import com.fse.userprofile.config.Configs;
import com.fse.userprofile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.web.reactive.function.client.WebClient.builder;

@Service
public class UserProfileConsumer {
    //@Autowired
    //RestTemplate restTemplate;
    @Value("${kafka.service.url}")
    public static String MDB_BASE_URL;
    WebClient webClient;
    public UserProfileConsumer(WebClient.Builder builder){
        System.out.println("URLLLLL"+MDB_BASE_URL);
        this.webClient = builder().baseUrl("http://localhost:8086")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @KafkaListener(topics = "userprofile-events",groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessage(User user){
        System.out.println("User :"+Configs.kafkaServiceUrl);
        User user1 = this.webClient.post().uri("/userprofile/saveuser").bodyValue(user).retrieve().bodyToMono(User.class).block();
        System.out.println("Saved to MDB:"+user1.toString());
    }
}
