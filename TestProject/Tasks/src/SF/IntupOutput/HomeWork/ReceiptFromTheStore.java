package SF.IntupOutput.HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReceiptFromTheStore {
    public static void main(String[] args) throws FileNotFoundException {
        summ();
    }

    public static void summ() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("C://File.txt"));
        double result = 0;
        String[] headers = scanner.nextLine().split(";");
        while (scanner.hasNextLine()) {
            String[] check = scanner.nextLine().split(";");
            result += Double.parseDouble(check[2]) * Double.parseDouble(check[3]);
            System.out.println(Double.parseDouble(check[2])+ "*" + Double.parseDouble(check[3])+
                               "=" +(Double.parseDouble(check[2]) * Double.parseDouble(check[3])));

        }
        System.out.println(result);
    }
}