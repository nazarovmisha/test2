import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOneThreadThread {
    public static void main(String[] args) throws InterruptedException {
        Thread threadMax = new Thread() {
            @Override
            public void run() {
                List<Integer> numbers = new ArrayList<>();
                for (int i = 0; i < 10000000; i++) {
                    numbers.add(i);
                }
                long max = Collections.max(numbers);
                System.out.println("Максимальное число:" + max);
            }
        };

        Thread unsorted = new Thread() {
            List<Integer> unsorted = new ArrayList<>();

            @Override
            public void run() {
                for (int i = 10000000; i <= 1; i--) {
                    unsorted.add(i);
                }
                Collections.sort(unsorted);
                System.out.println("List is sorted now");
            }
        };

        Thread remove = new Thread() {
            @Override
            public void run() {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < 10000000; i++) {
                    list.add(i);
                }
                while (list.size() != 0) {
                    list.remove(list.size() - 1);
                }
                System.out.println("List cleared");
            }
        };

        long start = System.currentTimeMillis();
        threadMax.start();
        unsorted.start();
        remove.start();
        threadMax.join();
        unsorted.join();
        remove.join();
        long end = System.currentTimeMillis();
        System.out.println("Total time :" + (end - start) + "ms");
    }
}