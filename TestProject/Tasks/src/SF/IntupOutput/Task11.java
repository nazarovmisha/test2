package SF.IntupOutput;

import java.io.*;
import java.util.Scanner;

public class Task11 {
    public void solve() throws IOException {


        Scanner scanner = new Scanner(new FileInputStream("Root/src/arithmetic.txt"));
        StringBuilder answers = new StringBuilder();

        while (scanner.hasNextLine()) {
            String[] strings = scanner.nextLine().split(" ");
            int num1 = Integer.parseInt(strings[0]);
            String operand = strings[1];
            int num2 = Integer.parseInt(strings[2]);


            switch (operand) {
                case "+":
                    answers.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2).append("\n");
                    break;
                case "-":
                    answers.append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2).append("\n");
                    break;
                case "*":
                    answers.append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2).append("\n");
                    break;


            }

            FileWriter writer = new FileWriter(new File("Root/src/answers.txt"), false);
            writer.write(answers.toString().trim());
            writer.flush();


        }
    }
}
