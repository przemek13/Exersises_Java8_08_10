package com.company.Exercise6;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<User> randomUser = () -> {
            Random generator = new Random();
            return new User(User.NAMES_LIST.get(generator.nextInt(User.getListRange())), generator.nextInt(User.getMaxAge()));
        };
        System.out.println(randomUser.get());
    }
}
