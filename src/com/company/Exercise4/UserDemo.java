package com.company.Exercise4;

import java.time.LocalDate;
import java.util.function.Predicate;

public class UserDemo {

    public static void main(String[] args) {

        User testUser = new User("Adam Nowak", LocalDate.of(2000, 10, 10));

        Predicate<User> ageCheck = (user) -> {
            if (user.returnUserAge(user) > 18) {
                return true;
            } else return false;
        };
        checkIfOfAge(ageCheck, testUser);
    }

    static void checkIfOfAge(Predicate<User> ageCheck, User user) {
        System.out.println(user.getUserName() + " is of age: " + ageCheck.test(user));
    }
}