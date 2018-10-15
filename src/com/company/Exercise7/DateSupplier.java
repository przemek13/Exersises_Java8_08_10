package com.company.Exercise7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class DateSupplier {
    public static void main(String[] args) {
        Supplier getDate = () -> LocalDate.now().getDayOfWeek();
        System.out.println("Current date = " + LocalDate.now() + " -> " + getDate.get());
    }
}
