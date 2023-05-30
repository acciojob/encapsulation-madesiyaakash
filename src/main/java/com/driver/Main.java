package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("John");
        String name = obj.getName();
        System.out.println("Name: " + name);

    }
}

