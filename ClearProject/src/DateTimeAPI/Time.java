package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Europe/Moscow"));
        System.out.println(zdt);
    }
}