package com.navid.jmstut.sender;

import com.navid.jmstut.config.JmsConfig;
import com.navid.jmstut.model.HelloMessage;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class HelloMessageSender {

    public final JmsTemplate jmsTemplate;

    public HelloMessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }


    @Scheduled(fixedDelay = 2000)
    void sendHelloMessage(){
        System.out.println("sending message");

        HelloMessage message = HelloMessage.builder().id(UUID.randomUUID()).message("hello!!!").build();

        jmsTemplate.convertAndSend(JmsConfig.MYQUEUE, message);

        System.out.println("message sent");

    }

}
