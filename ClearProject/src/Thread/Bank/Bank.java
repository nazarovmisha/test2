package Thread.Bank;

public class Bank {
    private static int money = 10000;

    static int getMoney() {
        return money;
    }

    static synchronized void takeMoney(int money) {
        Bank.money -= money;
    }

    static synchronized void repayMoney(int money) {
        Bank.money += money;

    }

   static class Client extends Thread {
        @Override
        public void run() {
            while (true) {
                takeMoney(1000);
                repayMoney(1000);

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        new Client().start();
        new Client().start();
        new Client().start();

        while (true) {
            System.out.println(Bank.getMoney());
            Thread.sleep(1000);
        }
    }

}
