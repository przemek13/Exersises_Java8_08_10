package com.company.Exercise4;

import java.time.LocalDate;
import java.time.Period;

public class User {

    private final String userName;
    private final LocalDate userBirthDate;

    protected User(String userName, LocalDate userBirthDate) {
        this.userName = userName;
        this.userBirthDate = userBirthDate;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    protected int returnUserAge(User user) {
        if ((getUserBirthDate() != null) && (LocalDate.now() != null)) {
            return Period.between(getUserBirthDate(), LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }
}


