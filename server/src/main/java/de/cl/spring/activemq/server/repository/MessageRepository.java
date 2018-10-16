package de.cl.spring.activemq.server.repository;

import de.cl.spring.activemq.common.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String>{


}
