package com.example.springweb.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank(message = "Name field is mandatory and can't be empty")
    @Size(min = 3, max = 50, message = "Name field needs to be between 3 and 50 characters")
    private String name;

    @NotNull(message = "Age field is mandatory")
    @Min(value = 18, message = "You should be 18 or above to register")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
