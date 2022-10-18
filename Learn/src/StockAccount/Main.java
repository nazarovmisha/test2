package StockAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StockAccount sa = new StockAccount();
        sa.start();
        long profit = 0;
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            command = scanner.next();
            switch (command) {
                case "check":
                    System.out.println(sa.money);
                    break;
                case "fix":
                    profit += (long) sa.money - 1000;
                    System.out.println("Profit is : " + profit);
                    sa.money = 1000;
            }
        }
    }
}