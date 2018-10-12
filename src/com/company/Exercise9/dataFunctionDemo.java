package com.company.Exercise9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.function.Function;

public class dataFunctionDemo {
    public static void main(String[] args) {

        Function<String, LocalDate> printUser = (data) -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
            return LocalDate.parse(data, formatter);
        };
        System.out.println(printUser.apply("January 02, 2000"));
    }
}
