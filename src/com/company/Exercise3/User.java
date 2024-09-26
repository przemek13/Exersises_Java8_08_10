package com.company.Exercise3;

import java.time.LocalDate;
import java.time.Period;

public class User {

    private final String userName;
    private final LocalDate userBirthDate;

    public String getUserName() {
        return userName;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    protected User(String userName, LocalDate userBirthDate) {
        this.userName = userName;
        this.userBirthDate = userBirthDate;
    }

    protected void printUser(User user) {
        System.out.println("Name: " + user.getUserName());
        System.out.println("Birth date: " + user.getUserBirthDate());
    }

    protected int returnUserAge(User user) {
        LocalDate birthDate = getUserBirthDate();
        LocalDate now = LocalDate.now();
        if (birthDate != null && now != null) {
            return Period.between(birthDate, now).getYears();
        } else {
            return 0;
        }
    }

}
