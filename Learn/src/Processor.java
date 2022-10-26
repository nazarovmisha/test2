public class Processor extends Thread {

    private  boolean isRunning = true;

    @Override
    public void run() {
        while (isRunning) {
            try {
                System.out.println("Processing");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void shutDown() {
        isRunning = false;
    }
}

class App {
    public static void main(String[] args) throws InterruptedException {
        Processor processor = new Processor();
        processor.start();
        Thread.sleep(1000);
        processor.shutDown();
    }
}