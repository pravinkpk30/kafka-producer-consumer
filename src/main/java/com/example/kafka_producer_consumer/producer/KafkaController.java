package com.example.kafka_producer_consumer.producer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final KafkaProducer producer;

    public KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }
    @PostMapping("/orders")
    public void publishMsgToTopic(@RequestBody OrderDetails orderDetails) {
        this.producer.publishMessage(orderDetails);
    }
}
