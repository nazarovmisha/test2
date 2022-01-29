package ArraysStrings;

import java.util.Arrays;
import java.util.Calendar;


public class Task1 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        int[] arr = {5, 24, 3, 66, 38, 16, 27};
        Arrays.sort(arr);
        System.out.println(arr[2]);

    }
}
