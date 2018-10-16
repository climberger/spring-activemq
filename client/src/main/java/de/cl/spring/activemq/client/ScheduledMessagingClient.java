package de.cl.spring.activemq.client;

import de.cl.spring.activemq.common.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component
public class ScheduledMessagingClient {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    @Scheduled(fixedRateString = "${nterra.messaging.client.message.interval}")
    public void sendMessage() {
        // Send a message with a POJO - the template reuse the message converter
        Message message = new Message(dateFormat.format(new Date()), "cast@nterra.com", "Hello?");
        log.info("Sending the message: \n{}", message.toString());
        jmsTemplate.convertAndSend(queue, message);

    }
}