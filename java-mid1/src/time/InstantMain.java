package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now();//utc 기준
        System.out.println("now: " + now);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        Instant from = Instant.from(zonedDateTime);
        System.out.println("from: " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart: " + epochStart);

    }
}
