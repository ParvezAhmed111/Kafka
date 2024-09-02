package com.deliveryBoy.service;

import com.deliveryBoy.config.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate; //used to send messages

    private final Logger logger= LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location){
        this.kafkaTemplate.send(Constants.LOCATION_TOPIC_NAME, location);
        this.logger.info("message produced");
        return true;
    }
}
