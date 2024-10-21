package com.kafka.application.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.kafka.application.model.Item;

@Configuration
public class KafkaProducerConfig {

	@Bean
	public ProducerFactory<String, Item> producerFactory(){
		
		Map<String, Object> configProps = new HashMap<String, Object>();
		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"192.168.254.124:9092");
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
	    configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
	    

	    return new DefaultKafkaProducerFactory<String, Item>(configProps);
	}
	
	 @Bean
	 public KafkaTemplate<String, Item> kafkaTemplate() {
	        return new KafkaTemplate<>(producerFactory());
	 }
	
}
