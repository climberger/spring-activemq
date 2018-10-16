package de.cl.spring.activemq.server.service;

import de.cl.spring.activemq.common.Message;
import de.cl.spring.activemq.server.repository.MessageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DefaultMessageService implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public void addMessage(Message message) {
        this.messageRepository.save(message);
        log.info("Message added to MongoDB: {}", message.toString());
    }

    @Override
    public Long getCount() {
        return this.messageRepository.count();
    }

    @Override
    public List<Message> getAll() {
        return this.messageRepository.findAll();
    }
}
