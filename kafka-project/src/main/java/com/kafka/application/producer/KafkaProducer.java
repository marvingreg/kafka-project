package com.kafka.application.producer;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaProducer {
	
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
	private org.slf4j.Logger log = LoggerFactory.getLogger(KafkaProducer.class);


	public void sendMessage(String msg) {
		log.info(String.format("Sending message to %s", msg));
		kafkaTemplate.send("someTopic", msg);
	}
	
	
	
	

}
