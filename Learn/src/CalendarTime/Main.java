package CalendarTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CalendarTime calendarTime = new CalendarTime();
        calendarTime.start();
        calendarTime.sleep(3000);
        calendarTime.interrupt();
    }
}