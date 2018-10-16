package de.cl.spring.activemq.client;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class JmsConfiguration {

    @Value("${nterra.messaging.queue}")
    private String queue;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(queue);
    }

}
