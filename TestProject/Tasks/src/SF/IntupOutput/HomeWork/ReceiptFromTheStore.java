package SF.IntupOutput.HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReceiptFromTheStore {

    public static class HomeWork {
        ;

        public static void main(String[] args) throws FileNotFoundException {
            summ();
        }

         public static void summ(String product) throws FileNotFoundException {
            Scanner scannerReceipt = new Scanner(new FileInputStream("D://File.txt"));
            Scanner scannerDiscount = new Scanner(new FileInputStream("D://Discount.txt"));

            double totalCost = 0;
            double totalCostWithDiscount = 0;
            String[] headers = scannerReceipt.nextLine().split(";");
            while (scannerReceipt.hasNextLine() && scannerDiscount.hasNextLine()) {
                String[] check = scannerReceipt.nextLine().split(";");
                String[] checkDiscount = scannerDiscount.nextLine().split(";");
                totalCost = Double.parseDouble(check[2]) * Double.parseDouble(check[3]);
                if (product.equals(checkDiscount[2])) {
                    check[2] = checkDiscount[2];
                }
                System.out.println(totalCost);


            }

        }
    }
}




