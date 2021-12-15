import java.util.Scanner;

public class c328_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }

    private static boolean checkName(String name) {
        //Написать код здесь
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }

        private static void sortByLength (String[]words){
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = 0; j < words.length - 1; j++) {
                    if (words[j].length() > words[j + 1].length()) {
                        String tmp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = tmp;
                    }
                }
            }
        }
    }
