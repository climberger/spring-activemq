package de.cl.spring.activemq.server.controller;

import de.cl.spring.activemq.common.Message;
import de.cl.spring.activemq.server.controller.response.CountResponse;
import de.cl.spring.activemq.server.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping(value="/messages/count")
    public ResponseEntity<CountResponse> getCount(){
        CountResponse countResponse = new CountResponse(messageService.getCount());
        return new ResponseEntity<>(countResponse, HttpStatus.OK);
    }

    @GetMapping(value="/messages")
    public ResponseEntity<List<Message>> getMessages(){
        return  new ResponseEntity<>(messageService.getAll(),HttpStatus.OK);
    }



}
