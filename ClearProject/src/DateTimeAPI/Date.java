package DateTimeAPI;

import java.time.*;


public class Date {


    private static boolean isGreaterTime(LocalTime time, Duration duration) {
        return time.plus(duration).isAfter(LocalTime.now());
    }
}