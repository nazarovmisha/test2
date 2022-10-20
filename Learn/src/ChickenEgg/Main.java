package ChickenEgg;

public class Main {
    public static void main(String[] args) {

        ChickenEgg chicken = new ChickenEgg("Курица");
        ChickenEgg egg = new ChickenEgg("Яйцо");
        System.out.println("Начинаем спор: кто появился первым?");
        chicken.start();
        egg.start();
        while ((chicken.isAlive()) || egg.isAlive()) {
            try {
                Thread.sleep(100);
                System.out.println("Курица");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (egg.isAlive()) {
            try {
                egg.interrupt();
                egg.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Первым появилось яйцо");
        } else {
            try {
                chicken.interrupt();
                chicken.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Первой появилась курица");
        }
        System.out.println("Спор закончен");
    }
}