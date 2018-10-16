package com.company.Exercise6;

import java.util.Arrays;
import java.util.List;

public class User {

    private String name;
    private int age;
    private final static int MAX_AGE = 100;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static int getListRange() {
        return LIST_RANGE;
    }

    public static int getMaxAge() {
        return MAX_AGE;
    }

    protected final static List<String> NAMES_LIST = Arrays.asList("Jan Kowalski", "Adam Nowak", "Marek Kowal", "Maciej Kot", "Karol Nowy");

    private final static int LIST_RANGE = NAMES_LIST.size();

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
