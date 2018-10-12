package com.company.Exercise4;

import java.time.LocalDate;
import java.util.function.Predicate;

public class UserDemo {

    public static void main(String[] args) {

        Predicate<User> ageCheck = (user) -> {
            System.out.print(user.getUserName() + " is of age: ");
            if (user.returnUserAge(user) > 18) {
                return true;
            } else return false;
        };
        System.out.print(ageCheck.test(new User("Adam Nowak", LocalDate.of(1999, 10, 10))));
    }
}