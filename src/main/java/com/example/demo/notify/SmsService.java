package com.example.demo.notify;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
@Qualifier("email")
//@ConditionalOnProperty(name = "notify.mode", havingValue = "sms")
public class SmsService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Отправка SMS: " + message);
    }
}
