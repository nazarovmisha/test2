package Thread.HomeWork;

import java.io.IOException;

public class Unloading2 extends Thread {
    static int firstShipCapacity = 150;
    static int secondShipCapacity = 220;
    static int craneCapacity = 30;


    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread firstThread = new Thread() {

            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        while (firstShipCapacity > 0) {
                            firstShipCapacity -= craneCapacity;
                            if (firstShipCapacity < 0) {
                                firstShipCapacity = 0;
                            }
                            System.out.println(firstShipCapacity);
                        }
                        System.out.println("the first ship unloaded");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        Thread secondThread = new Thread() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {


                        while (secondShipCapacity > 0) {

                            secondShipCapacity -= craneCapacity;
                            if (secondShipCapacity < 0) {
                                secondShipCapacity = 0;
                            }
                            System.out.println(secondShipCapacity);
                        }
                        System.out.println("the second ship unloaded");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        firstThread.start();
        firstThread.sleep(1000);
        firstThread.join();
        secondThread.start();
        firstThread.sleep(1000);
        secondThread.join();
    }
}




