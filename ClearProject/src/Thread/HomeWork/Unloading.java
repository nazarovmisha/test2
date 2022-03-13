package Thread.HomeWork;

import java.io.IOException;

public class Unloading extends Thread {
    static int firstShipCapacity = 150;
    static int secondShipCapacity = 220;
    static int craneCapacity = 30;


    public static void main(String[] args) throws InterruptedException {

        Thread firstthread = new Thread() {

            @Override
            public void run() {
                while (firstShipCapacity > 0) {

                    firstShipCapacity -= craneCapacity;
                }
                System.out.println("the first ship unloaded");
            }

        };
        Thread secondthread = new Thread() {
            @Override
            public void run() {


                while (secondShipCapacity > 0) {

                    secondShipCapacity -= craneCapacity;

                }
                System.out.println("the second ship unloaded");

            }

        };
        firstthread.start();
        firstthread.sleep(1000);
        firstthread.join();
        secondthread.start();
        firstthread.sleep(1000);
        secondthread.join();





    }
}




