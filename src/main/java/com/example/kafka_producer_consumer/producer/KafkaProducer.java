package com.example.kafka_producer_consumer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC = "order_topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishMessage(OrderDetails orderDetails) {
        this.kafkaTemplate.send(TOPIC, orderDetails.toString());
    }
}
