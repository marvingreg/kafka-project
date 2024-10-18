package com.kafka.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.application.producer.KafkaProducer;

@RestController
@RequestMapping("messages")
public class MessageController {
	
	@Autowired
	KafkaProducer kafkaProducer;
	
	@PostMapping
	private ResponseEntity<String> sendMessage(@RequestBody String message){
		
		kafkaProducer.sendMessage(message);
		
		return new ResponseEntity<String>("Successfully sent a message", HttpStatus.OK);
	}

}
