package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceImpl implements GreetingService {

    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }


}
