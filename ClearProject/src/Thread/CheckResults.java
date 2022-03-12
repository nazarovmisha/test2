package Thread;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            public void run(){
                for (int i = 0; i < 10; i++) {
                    CheckResults.counter++;
                }
            }
        }.start();
        while (CheckResults.counter < 10) {
            System.out.println("Not reached yet");
            Thread.sleep(1000); // 1 секунда
        }
        System.out.println("Reached");
    }

}