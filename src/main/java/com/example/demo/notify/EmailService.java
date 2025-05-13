package com.example.demo.notify;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Qualifier("email")
//@ConditionalOnProperty(name = "notify.mode", havingValue = "email")
public class EmailService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Отправка Email: " + message);
    }
}
