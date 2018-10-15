package Exercise2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class ConsumerImplementation {
    public static void main(String[] args) {

        final DateTimeFormatter hours = DateTimeFormatter.ofPattern("HH");
        final DateTimeFormatter minutes = DateTimeFormatter.ofPattern("mm");

        Consumer<LocalTime> substringTime = (time) -> {
            System.out.println("Godzina: " + time.format(hours));
            System.out.println("Minut: " + time.format(minutes));
        };
        substringTime.accept(LocalTime.now());
    }
}
