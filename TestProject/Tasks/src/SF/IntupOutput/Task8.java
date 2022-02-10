package SF.IntupOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task8 {

    public void solution(Double n) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/EGE.txt"));
        String[] header = scanner.nextLine().split(";");

        while (scanner.hasNextLine()) {
            String[] element = scanner.nextLine().split(";");
            double percents = Double.parseDouble(element[2]);
            if (percents >= n) System.out.println(element[0]);
        }
    }
}

