package com.example.notification_publisher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class NewsPublisherController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/create-news/{type}")
    public void createNews(@RequestBody String news, @PathVariable String type) {
        switch (type.toLowerCase()) {
            case "sports":
                kafkaTemplate.send("sports-news", news);
                break;
            case "tech":
                kafkaTemplate.send("tech-news", news);
                break;
            case "entertainment":
                kafkaTemplate.send("entertainment-news", news);
                break;
        }
    }
}
