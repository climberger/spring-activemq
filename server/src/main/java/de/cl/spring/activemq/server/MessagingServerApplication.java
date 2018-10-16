package de.cl.spring.activemq.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class MessagingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingServerApplication.class, args);
	}
}
