package de.cl.spring.activemq.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MessagingClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(MessagingClientApplication.class, args);
	}
}
