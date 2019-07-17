package com.stackroot;

import org.springframework.stereotype.Component;

@Component
public class User {
    String name;
    public User(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}