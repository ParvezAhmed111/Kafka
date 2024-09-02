# STEPS to run the service 

##  1. Start zookeeper
```shell
bin\windows\zookeeper-server-start.bat config\zookeeper.properties
```

## 2. Strat kafka server
```shell
bin\windows\kafka-server-start.bat config\server.properties
```

## 3. Create new topic 
```shell
bin\windows\kafka-topics.bat --create --topic user-topic --bootstrap-server localhost:9092
```

## 4. Produce new topic
```shell
bin\windows\kafka-console-producer.bat --topic user-topic --bootstrap-server localhost:9092
```

## 5. Consuming message
```shell
bin\windows\kafka-console-consumer.bat --topic user-topic --from-beginning --bootstrap-server localhost:9092
```

## 6. Producer configuration
```shell
spring.kafka.producer.bootstrap-servers=localhost:9092
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer
```

## 7. Consumer configuration
```shell
server.port=8081
spring.kafka.consumer.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=group-id
spring.kafka.consumer.auto-offset-reset=earliest
spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer
```
