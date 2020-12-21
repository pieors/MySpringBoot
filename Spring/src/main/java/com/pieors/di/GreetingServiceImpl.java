package com.pieors.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class GreetingServiceImpl<post> implements GreetingService {

    @Autowired
    HelloWorld helloWorld;

    @Override
    public void greet() {
        System.out.println("Simple greeting");
    }

    @PostConstruct
    public void post() {
        System.out.println("Greeting Service Impl is ready:");
            helloWorld.hello();
    }
}
