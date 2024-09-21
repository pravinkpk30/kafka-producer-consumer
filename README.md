# kafka-producer-consumer
Sample messaging system using spring boot framework and spring kafka

# Postman sample
![image](https://github.com/user-attachments/assets/dd59ac17-e5b8-4918-82ad-c9ade114e1dd)

# Console Output
2024-09-21T16:20:29.620+05:30  INFO 3082 --- [kafka-producer-consumer] [nio-8080-exec-2] o.a.k.c.t.i.KafkaMetricsCollector        : initializing Kafka metrics collector
2024-09-21T16:20:29.624+05:30  INFO 3082 --- [kafka-producer-consumer] [nio-8080-exec-2] o.a.k.clients.producer.KafkaProducer     : [Producer clientId=kafka-producer-consumer-producer-1] Instantiated an idempotent producer.
2024-09-21T16:20:29.630+05:30  INFO 3082 --- [kafka-producer-consumer] [nio-8080-exec-2] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.7.1
2024-09-21T16:20:29.630+05:30  INFO 3082 --- [kafka-producer-consumer] [nio-8080-exec-2] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: e2494e6ffb89f828
2024-09-21T16:20:29.630+05:30  INFO 3082 --- [kafka-producer-consumer] [nio-8080-exec-2] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1726915829630
2024-09-21T16:20:29.637+05:30  INFO 3082 --- [kafka-producer-consumer] [umer-producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=kafka-producer-consumer-producer-1] Cluster ID: XKj-1cMoQ_u1Hr9y8NHynA
2024-09-21T16:20:29.751+05:30  INFO 3082 --- [kafka-producer-consumer] [umer-producer-1] o.a.k.c.p.internals.TransactionManager   : [Producer clientId=kafka-producer-consumer-producer-1] ProducerId set to 0 with epoch 0
**OrderDetails{orderId=1, orderName='Shoes', qty=2, price=5000}
OrderDetails{orderId=2, orderName='Tshirt', qty=10, price=2500}**
