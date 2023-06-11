package com.navid.jmstut.listener;

import com.navid.jmstut.config.JmsConfig;
import com.navid.jmstut.model.HelloMessage;
import jakarta.jms.JMSException;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MYQUEUE)
    public void HelloMessageListener(@Payload HelloMessage message,
                                     @Headers MessageHeaders header
                                     ) throws JMSException {
        System.out.println("reading message");
        System.out.println(message.getMessage());
        System.out.println(header);

    }
}
