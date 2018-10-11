package com.company.Exercise7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class DateSupplier {
    public static void main(String[] args) {
        getDate(() -> LocalDate.now().getDayOfWeek());
    }

    static void getDate(Supplier<DayOfWeek> supplier) {
        System.out.println("Current date = " + LocalDate.now() + " -> " + supplier.get());
    }
}
