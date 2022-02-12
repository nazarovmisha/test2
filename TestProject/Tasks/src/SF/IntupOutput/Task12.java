package SF.IntupOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task12 {
    public void findMerchant(String name) throws FileNotFoundException {
        String result = "";
        int s = 0;
        Scanner scanner = new Scanner(new FileInputStream("Root/src/outcome.txt"));
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String[] seller = scanner.nextLine().split(";");
            if (seller[1].equals(name)) {
                System.out.println(seller[1] + "," + seller[2] + "," + seller[4] + ","
                                   + (Integer.parseInt(seller[2]) * Integer.parseInt(seller[4])));
                s += Integer.parseInt(seller[3]) * Integer.parseInt(seller[4]);
            }
        }
        System.out.println("tax;" + s * 0.15);
    }
}
