package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl1 implements GreetingService {

    public void greet(String name) {
        System.out.println("Hi, " + name + "!");
    }


}
