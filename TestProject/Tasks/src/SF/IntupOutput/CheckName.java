package SF.IntupOutput;

import java.util.Arrays;
import java.util.Scanner;

public class CheckName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            System.out.println("What is your name?");
            String name = scanner.nextLine();
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        name.trim();
        String[] words = name.split(" ");
        sortByLength(words);
        if (words.length == 3) {
//           System.out.println("Good name" + name);
            return true;
        } else
            return false;
    }

    private static String formatName(String name) {
        String[] words = name.trim().split(" ");
        sortByLength(words);
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + "";
            }
        }
        return result;
    }

    private static void sortByLength(String[] words) {
        Arrays.sort(words);

    }
}
