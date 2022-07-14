package com.spring.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaListeners {
	
	@KafkaListener(topics = "test",groupId = "group1")
	void listener(String data) {
		System.out.println("Listener Recieved "+ data + " :)");
	}

}
