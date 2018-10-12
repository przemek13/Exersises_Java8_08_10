package com.company.Exercise8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String, User> printUser = (data) -> {
            String[] userInput = data.split(",");
            return new User(userInput[0], userInput[1], userInput[2]);
        };
        System.out.println(printUser.apply("Adam,Kowalski,20"));
    }
}