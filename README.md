# kafka-producer-consumer
![image](https://github.com/user-attachments/assets/34fcb804-28c9-45f2-9165-eaaf4610f651)

# Postman sample
![image](https://github.com/user-attachments/assets/dd59ac17-e5b8-4918-82ad-c9ade114e1dd)

# Spring Boot Console Output
**OrderDetails{orderId=1, orderName='Shoes', qty=2, price=5000}
OrderDetails{orderId=2, orderName='Tshirt', qty=10, price=2500}**

# Steps to run the application
1. Run docker-compose file to run kafka and zookeeper in local docker container
2. Run spring boot application
3. Verify spring boot console that your application runs properly or not
4. Execute service call in postman like above screenshot
5. Response will be displayed in spring boot console

# Kafka Flows
1. Producer publish the message or event to topic (eg: **order_topic** in this example)
2. Consumer poll every time in broker (server) to check the new message comes or not
3. Here kafka cluster runs in 9092 port in docker contianer which contains the broker or server
4. Zookeeper manages the kafka cluster and runs on 2181 port
5. Message has been printed in console as soon as the new message receives

# Docker container
![image](https://github.com/user-attachments/assets/8cdbb8b9-3f3f-40c0-940e-775f414d749f)

