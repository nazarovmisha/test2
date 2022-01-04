import java.util.Scanner;

public class Converter {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isCorrectName = false;
        String str = "";
        while (!isCorrectName) {
            System.out.println("Введите слово");
            str = sc.nextLine();
            isCorrectName = checkStr(str);
            if (!isCorrectName) System.out.println("Введите кореектное имя");
        }
        System.out.println("Слово наоборот-" + reverseString(str));

    }


    public static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;

    }

    private static boolean checkStr(String str) {
        if (str.split(" ").length == 1) {
            return true;
        } else return false;
    }
}



