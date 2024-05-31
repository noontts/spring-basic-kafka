package com.example.notification_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class NotificationConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationConsumerApplication.class, args);
    }

	@KafkaListener(id = "user", topics = {"entertainment-news"})
	public void entertainmentListen(String news) {
		System.out.println("******* Entertainment news********\uD83E\uDE84");
		System.out.println(news);
	}

	@KafkaListener(id = "tech-user", topics = {"tech-news"})
	public void techListen(String news) {
		System.out.println("******* Breaking Tech news********\uD83E\uDE84");
		System.out.println(news);
	}

	@KafkaListener(id = "normal-user", topics = {"sports-news","tech-news", "entertainment-news"})
	public void normalListen(String news) {
		System.out.println("******* Breaking news********\uD83E\uDE84");
		System.out.println(news);
	}
}

