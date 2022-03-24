package DateTimeAPI;

import java.time.LocalTime;

public class TimeChange {
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(16, 30);
        LocalTime time1= time.withHour(14).plusMinutes(15);
        System.out.println(time1);
    }
}
