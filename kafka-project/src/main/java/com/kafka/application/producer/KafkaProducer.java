package com.kafka.application.producer;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.kafka.application.model.Item;

import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaProducer {
	
    @Autowired
    private KafkaTemplate<String, Item> kafkaTemplate;
	private org.slf4j.Logger log = LoggerFactory.getLogger(KafkaProducer.class);

	
	public void sendMessage(Item item) {
		log.info(String.format("Sending message to %s", item));
		kafkaTemplate.send("gps-position", item);
	}
	
	
	
	

}
