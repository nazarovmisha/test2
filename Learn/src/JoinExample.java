public class JoinExample {
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < 5000000; i++) {
                    JoinExample.count++;

                }
            }
        };
        thread.start();
        thread.join();
        System.out.println(count);
    }
}
