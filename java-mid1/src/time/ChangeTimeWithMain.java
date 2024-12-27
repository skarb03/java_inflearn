package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("LocalDateTime: " + localDateTime);

        LocalDateTime changeDt1 = localDateTime.with(ChronoField.YEAR, 2020);
        System.out.println("changeDt1: " + changeDt1);

        LocalDateTime changeDt2 = localDateTime.withYear(2020);
        System.out.println("changeDt2: " + changeDt2);

        LocalDateTime with1 = localDateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준날짜: "+ localDateTime);
        System.out.println("다음 금요일: " + with1);
    }

}
