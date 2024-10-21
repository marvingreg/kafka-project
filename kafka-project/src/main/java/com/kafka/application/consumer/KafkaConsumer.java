package com.kafka.application.consumer;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.kafka.application.model.Item;

@Service
public class KafkaConsumer {

	private final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics="gps-position", groupId = "myGroup")
	public void consumeMessage(Item msg) {
		log.info("A message received, here it is " +msg);
	}
	
}
