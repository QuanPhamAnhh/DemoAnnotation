package com.example.electriccar;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class VNEngine implements Engine{
    @Override
    public void run() {

    }
}
