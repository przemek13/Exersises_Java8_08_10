package Exersise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    protected final static List<User> users = new ArrayList<>();
    protected final static List<User> searchedUsers = new ArrayList<>();

    protected static Optional<User> findByName(String usersName) {
        User searchedUser = null;
        for (User user : users) {
            if (usersName.equals(user.getFirstName())) {
                searchedUser = user;
            }
        }
        return Optional.ofNullable(searchedUser);
    }

    protected static Optional<List<User>> findByNameList(String usersName) {
        for (User user : users) {
            if (usersName.equals(user.getFirstName())) {
                searchedUsers.add(user);
            }
        }
        return Optional.ofNullable(searchedUsers);
    }
}
