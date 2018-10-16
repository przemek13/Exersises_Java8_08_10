package com.company.Exercise8;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<String, User> printUser = (data) -> {

            String[] userInput = data.split(",");

            return new User(userInput[DataIndex.FIRST_NAME.getValue()], userInput[DataIndex.LAST_NAME.getValue()], userInput[DataIndex.AGE.getValue()]);
        };
        System.out.println(printUser.apply("Adam,Kowalski,20"));
    }
}