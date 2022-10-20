package ChickenEgg;

import java.util.Random;

public class ChickenEgg extends Thread {
    public ChickenEgg(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(getTimeSleep());
                System.out.println(getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    final Random random = new Random();
    int getTimeSleep(){
        return random.nextInt(300);
    }
}