package Exersise1;

public class UserDemo {
    public static void main(String[] args) {
        User user1 = new User("Jan", "Kowalski");
        User user2 = new User("Adam", "Nowak");
        User user3 = new User("Jan", "Pawlak");

        UserService.users.add(user1);
        UserService.users.add(user2);
        UserService.users.add(user3);

        System.out.println(UserService.findByName("Karol"));
        System.out.println(UserService.findByName("Jan"));

        System.out.println(UserService.findByNameList("Karol"));
        System.out.println(UserService.findByNameList("Jan"));
    }
}