package com.company.Exercise4;

import java.time.LocalDate;
import java.util.function.Predicate;

public class UserDemo {

    public static void main(String[] args) {

        int ageOfMajority = 18;

        Predicate<User> ageCheck = (user) -> {
            System.out.print(user.getUserName() + " is of age: ");
            if (user.returnUserAge(user) > ageOfMajority) {
                return true;
            } else return false;
        };
        System.out.print(ageCheck.test(new User("Adam Nowak", LocalDate.of(1999, 10, 17))));
    }
}