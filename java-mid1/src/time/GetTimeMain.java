package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("Year: " + dt.get(ChronoField.YEAR));
        System.out.println("Month: " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("Day: " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("Hour: " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("minute: " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("second: " + dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println("Year: " + dt.getYear());
        System.out.println("Month: " + dt.getMonthValue());
        System.out.println("Day: " + dt.getDayOfMonth());
        System.out.println("Hour: " + dt.getHour());
        System.out.println("minute: " + dt.getMinute());
        System.out.println("second: " + dt.getSecond());

        System.out.println("편의 메서드 없음");
        System.out.println("MINUTE_OF_DAY: " +  dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_MINUTE: " + dt.get(ChronoField.SECOND_OF_MINUTE));

    }
}
