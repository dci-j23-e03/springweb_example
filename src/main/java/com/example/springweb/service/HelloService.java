package com.example.springweb.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String helloType, Integer numberOfTimes) {
        StringBuilder stringBuilder = new StringBuilder();
        if (numberOfTimes == null) {
            numberOfTimes = 1;
        }

        for (int i = 0; i < numberOfTimes; i++) {
            if ("world".equalsIgnoreCase(helloType)) {
                stringBuilder.append("Hello World ");
            } else if ("spring".equalsIgnoreCase(helloType)) {
                stringBuilder.append("Hello Spring MVC Framework ");
            } else {
                stringBuilder.append("Hello ");
            }
        }
        return stringBuilder.toString();
    }
}
