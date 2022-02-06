package SF.IntupOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public String getReceipt() throws FileNotFoundException{
        Scanner scanner = new Scanner(new FileInputStream("Root/src/receipt.txt"));
        double result = 0;
        while (scanner.hasNextLine()){
            String [] productinfo=scanner.nextLine().split(";");
            result+=Integer.parseInt(productinfo[1])*Double.parseDouble(productinfo[2]);
        }
        return String.format(Locale.US, "%.2f", result);
    }
}
