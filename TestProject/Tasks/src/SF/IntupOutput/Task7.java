package SF.IntupOutput;

import java.io.*;
import java.util.Scanner;

public class Task7 {

    public void dance() throws IOException {
        Scanner sc = new Scanner(new FileInputStream("Root/src/dance.txt"));
        StringBuilder result = new StringBuilder();
        int rhythm = Integer.parseInt(sc.nextLine());
        while (sc.hasNextLine()) {
            int step = Integer.parseInt(sc.nextLine());
            result.append(step / rhythm).append(" ").append(step % rhythm).append("\n");
        }

        FileWriter writer = new FileWriter(new File("Root/src/rhythm.txt"), false);
        writer.write(result.toString().trim());
        writer.flush();

    }
}