package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dateTime: " + dateTime);

        LocalDateTime plusDT = dateTime.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDT: " + plusDT);
    }
}
