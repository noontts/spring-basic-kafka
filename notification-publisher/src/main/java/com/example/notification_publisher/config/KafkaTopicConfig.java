package com.example.notification_publisher.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic sportNews() {
        return new NewTopic("sport-news", 3, (short) 2);
    }

    @Bean
    public NewTopic techNews() {
        return new NewTopic("tech-news", 3, (short) 2);
    }

    @Bean
    public NewTopic entertainmentNews() {
        return new NewTopic("entertainment-news", 3, (short) 2);
    }
}
