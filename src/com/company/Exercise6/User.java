package com.company.Exercise6;

import java.util.Arrays;
import java.util.List;

public class User {

    protected String name;
    protected int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected final static List<String> namesList = Arrays.asList("Jan Kowalski", "Adam Nowak", "Marek Kowal", "Maciej Kot", "Karol Nowy");

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
