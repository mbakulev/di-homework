package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;


public class SimpleTimer {

    private long startTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
        System.out.println("Timer started");
    }

    public void stop() {
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Timer stopped. Duration: " + duration + " ms");
    }

}
