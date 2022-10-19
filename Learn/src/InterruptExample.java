public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        Thread threadToInterrupt = new Thread() {

            public void run() {
                while (true) {
                    System.out.println("Working Hard");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupt");
                        break;
                    }
                }
            }
        };
        threadToInterrupt.start();
        Thread.currentThread().sleep(500);
        threadToInterrupt.interrupt();
    }
}