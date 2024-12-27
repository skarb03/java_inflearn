package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
//    public static void main(String[] args) {
//        LocalDate startDate = LocalDate.of(2024, 1, 1);
//        LocalDate endDate = LocalDate.of(2024, 11, 21);
//
//        long year = ChronoUnit.YEARS.between(startDate, endDate);
//        long month = ChronoUnit.MONTHS.between(startDate, endDate);
//        long day = ChronoUnit.DAYS.between(startDate, endDate);
//
//        System.out.println("시작 날짜 : " + startDate);
//        System.out.println("목표 날짜 : " + endDate);
//        System.out.println("남은 기간 : " + year + "년 " + month + "개월 " + day + "일");
//        System.out.println("디데이 : " + day + "일 남음");
//    }
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period period = Period.between(startDate, endDate);
        long day = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작 날짜 : " + startDate);
        System.out.println("목표 날짜 : " + endDate);
        System.out.println("남은 기간 : " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");
        System.out.println("디데이 : " + day + "일 남음");
    }
}
