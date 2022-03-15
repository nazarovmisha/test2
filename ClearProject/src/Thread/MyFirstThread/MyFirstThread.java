package Thread.MyFirstThread;

public class MyFirstThread extends Thread {


    @Override
    public void run() {
        System.out.println("Hi. I/m thread! My name is:" + getName());

    }
}