package Exersise1;

public class UserDemo {
    public static void main(String[] args) {

        System.out.println(UserService.findByName("Karol"));
        System.out.println(UserService.findByName("Jan"));

        System.out.println(UserService.findByNameList("Karol"));
        System.out.println(UserService.findByNameList("Jan"));
    }
}