package com.example.demo.notify;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.diagnostics.LoggingFailureAnalysisReporter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Value("${notify.mode}")
    private String serviceName;

    @Autowired
    private ApplicationContext applicationContext;

    // Если не найден бин, то используется по умолчанию SMS
    @Bean
    public NotificationService chosenService() {
        try {
            return (NotificationService) applicationContext.getBean(serviceName);
        } catch (NoSuchBeanDefinitionException ex) {
            System.out.println("Не найден бин " + serviceName);
            return (NotificationService) applicationContext.getBean("sms");
        }
    }
}
