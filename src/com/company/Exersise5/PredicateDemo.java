package com.company.Exersise5;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        LocalDate testDate = LocalDate.of(2018, 10, 12);

        Predicate<LocalDate> dateCheck = (date) -> {
            if ((Period.between(LocalDate.now(), testDate).getDays() > 0)) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(testDate + " is a date from the future: " + dateCheck.test(testDate));
    }
}
