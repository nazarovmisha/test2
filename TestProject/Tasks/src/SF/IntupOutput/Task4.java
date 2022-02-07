package SF.IntupOutput;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {

    public void writeOrder() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/numbers.txt"));
        int index = 1;
        String resString = "";
        while (scanner.hasNextLine()) {
            String nowNumber = scanner.nextLine();
            if (index == Integer.parseInt(nowNumber)) ;
            resString += nowNumber + " ";

            index++;
        }

        if (resString.equals("")) {
            resString = "0";
        }

        FileWriter writer = new FileWriter("Root/src/outpoot.txt", false);
        writer.write(resString.trim());
        writer.flush();

    }
}

