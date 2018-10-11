package com.company.Exercise6;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<User> randomUser = () -> {
            Random generator = new Random();
            return new User(User.namesList.get(generator.nextInt(5)), generator.nextInt(100));
        };
        returnRandomUser(randomUser);
    }

    static void returnRandomUser(Supplier<User> supplier) {
        System.out.println(supplier.get());
    }
}
