package com.example.kafka_producer_consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "order_topic", groupId = "order_consumer_group_id")
    public void getMessage(String message) {
        System.out.println(message);
    }
}
