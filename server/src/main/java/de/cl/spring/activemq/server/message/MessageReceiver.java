package de.cl.spring.activemq.server.message;

import de.cl.spring.activemq.common.Message;
import de.cl.spring.activemq.server.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageReceiver {

    @Autowired
    private MessageService messageService;

    @JmsListener(destination = "nterra.cast.message")
    public void receive(Message message) {
        log.info("Received Message: {}", message.toString());
        this.messageService.addMessage(message);
    }

}