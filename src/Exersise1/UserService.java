package Exersise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserService {

    protected final static List<User> USERS = Arrays.asList(
            new User("Jan", "Kowalski"),
            new User("Adam", "Nowak"),
            new User("Jan", "Pawlak")
    );

    protected final static List<User> SEARCHED_USERS = new ArrayList<>();

    protected static Optional<User> findByName(String usersName) {
        return Optional.ofNullable(searchList(usersName));
    }

    protected static Optional<List<User>> findByNameList(String usersName) {
        searchList(usersName);
        return Optional.ofNullable(SEARCHED_USERS);
    }

    private static User searchList(String userName) {
        User searchedUser = null;
        for (User user : USERS) {
            if (userName.equals(user.getFirstName())) {
                searchedUser = user;
                SEARCHED_USERS.add(user);
            }
        }
        return searchedUser;
    }
}
