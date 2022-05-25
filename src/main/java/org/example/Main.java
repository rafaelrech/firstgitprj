package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Person.builder()
                .dob(LocalDateTime.now())
                .lastName("Doe")
                .name("John")
                .build();
        System.out.println("Hello world!");
    }
}
