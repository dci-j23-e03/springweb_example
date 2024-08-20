package com.example.springweb.model;

public class Usera {
    private String namea;

    public String getName() {
        return namea;
    }

    public void setName(String name) {
        this.namea = name;
    }

    @Override
    public String toString() {
        return "Usera{" +
                "namea='" + namea + '\'' +
                '}';
    }
}
