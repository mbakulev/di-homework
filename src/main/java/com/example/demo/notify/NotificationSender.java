package com.example.demo.notify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationSender {
    private final NotificationService service;

    // Автоматическое внедрение через конструктор
    @Autowired
    public NotificationSender(NotificationService service) {
        this.service = service;
    }

    public void notifyUser(String message) {
        service.send(message);
    }

    // Внедрение через сеттер
  /*  @Autowired
    public void setSmsService(SmsService smsService) {
        this.service = smsService;
    }*/
}