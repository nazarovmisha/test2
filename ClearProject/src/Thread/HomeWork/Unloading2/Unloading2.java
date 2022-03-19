package Thread.HomeWork.Unloading2;

import java.io.IOException;

public class Unloading2 extends Thread {
    static int firstShipCapacity = 150;
    static int secondShipCapacity = 220;
    static int craneCapacity = 30;

    static Object lock = new Object();

    public static void main(String[] args) {

        Thread thread1 = new Thread() {

            @Override
            public void run() {
                synchronized (lock) {

                    while (firstShipCapacity > 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        firstShipCapacity -= craneCapacity;
                        if (firstShipCapacity < 0) {
                            firstShipCapacity = 0;
                        }
                        System.out.println(firstShipCapacity);
                    }
                    System.out.println("the first ship unloaded");
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {

                synchronized (lock) {
                    while (secondShipCapacity > 0) {
                        try {
                            Thread.sleep(1000);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        secondShipCapacity -= craneCapacity;
                        if (secondShipCapacity < 0) {
                            secondShipCapacity = 0;
                        }
                        System.out.println(secondShipCapacity);
                    }
                    System.out.println("the second ship unloaded");
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}



