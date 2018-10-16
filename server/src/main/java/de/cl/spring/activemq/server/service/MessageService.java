package de.cl.spring.activemq.server.service;


import de.cl.spring.activemq.common.Message;

import java.util.List;

public interface MessageService {

    public void addMessage(Message message);
    public Long getCount();
    public List<Message> getAll();

    

}
