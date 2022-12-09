package com.example.electriccar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    @Qualifier("VNEngine")
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}
