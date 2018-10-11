package Exercise2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class ConsumerImplementation {
    public static void main(String[] args) {

        final DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime now = LocalTime.now();

        Consumer<String> substringTime = (newNow) -> {
            System.out.println("Godzina: " + newNow.substring(0,2));
            System.out.println("Minuty: " + newNow.substring(3,5));
        };
        substringTime.accept(time.format(now));
    }
}
