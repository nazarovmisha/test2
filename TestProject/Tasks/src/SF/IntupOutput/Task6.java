package SF.IntupOutput;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Task6 {
    public void solution() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/data.txt"));
        int length = 0, k = 0;
        StringBuilder allStrings = new StringBuilder();

        int limit = Integer.parseInt(scanner.nextLine());
        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            allStrings.append(string).append("\n");
            length += string.length();
            k++;
        }

        StringBuilder result = new StringBuilder(length / k + "\n");
        String[] strings = allStrings.toString().trim().split("\n");
        for (String string : strings) {
            if (Math.abs(string.length() - length / k) <= limit) result.append(string).append("\n");
        }


        FileWriter writer = new FileWriter("Root/src/output.txt", false);
        writer.write(result.toString().trim());
        writer.flush();
    }
}
