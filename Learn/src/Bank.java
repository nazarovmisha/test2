import java.util.concurrent.atomic.AtomicInteger;

public class Bank {

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        while (true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }

    AtomicInteger money = new AtomicInteger(10000);

    int getMoney() {
        return money.get();
    }

    void take(int money) {
        this.money.addAndGet(-money);
    }

    void repay(int money) {
        this.money.addAndGet(money);
    }

    class Client extends Thread {
        @Override
        public void run() {
            while (true) {
                take(1000);
                repay(1000);
            }
        }
    }

    public Bank() {
        new Client().start();
        new Client().start();
        new Client().start();
    }
}