package HomeWork;


import java.util.Arrays;
import java.util.Comparator;

public class ComparatorByLength implements Comparator<String> {
    String[] arr;

    public static void main(String[] args) {
    }

    @Override
    public int compare(String arg0, String arg1) {
        if (arg0 == null)
            return 1;
        if (arg1 == null)
            return -1;
        return arg0.length() - arg1.length();
    }

    public void сomparatorByLength(String[] arr) {
        this.arr = arr;
    }

    public void sortArr() {
        Arrays.sort(arr, new ComparatorByLength());
        System.out.println(Arrays.toString(arr));
    }
}


