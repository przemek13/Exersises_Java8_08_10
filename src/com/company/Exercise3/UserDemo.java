package com.company.Exercise3;

import java.time.LocalDate;
import java.util.function.Consumer;

public class UserDemo {
    public static void main(String[] args) {

        Consumer<User> userData = (user) -> {
            user.printUser(user);
            System.out.println("Age: " + user.returnUserAge(user));
        };
        userData.accept(new User("Adam Bielecki", LocalDate.of(1983, 05, 12)));
    }
}
