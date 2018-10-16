package de.cl.spring.activemq.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Message implements Serializable {

    private String date;
    private String to;
    private String body;

}
