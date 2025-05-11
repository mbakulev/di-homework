package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Lazy
@Getter
@Setter
public class ScopeBean {

    public String data;

    @PostConstruct
    public void init() {
        System.out.println("Scope бин создан!");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Scope бин уничтожен!");
    }
}
