package CalendarTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTime extends Thread {
    public void run() {
        while (!isInterrupted()) {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            System.out.println(dateFormat.format(calendar.getTime()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("Clock was stopped");
    }
}