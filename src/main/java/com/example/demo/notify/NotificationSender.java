package com.example.demo.notify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationSender {
    private NotificationService service;
    private final NotificationService emailService;
    private final NotificationService smsService;
    // Автоматическое внедрение через конструктор
//    @Autowired
//    public NotificationSender(@Qualifier("chosenService") NotificationService service) {
//        this.service = service;
//    }

    @Autowired
    public NotificationSender(@Qualifier("email") NotificationService emailService, @Qualifier("sms") NotificationService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.service = emailService;
    }

    public void notifyUser(String message) {
        service.send(message);
    }

    public void setService(String serviceName) {
        if (serviceName.equals("sms")) {
           this.service = smsService;
        }
        if (serviceName.equals("email")) {
            this.service = emailService;
        }
    }
    // Внедрение через сеттер
  /*  @Autowired
    public void setSmsService(SmsService smsService) {
        this.service = smsService;
    }*/
}