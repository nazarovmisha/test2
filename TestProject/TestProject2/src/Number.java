import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Введите номер мобильного телефона РФ в формате +7 *** *** ** **");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            String reg = "([+7]+[\s]+[0-9]{3}+[\s]+[0-9]{3}+[\s]+[0-9]{2}+[\s]+[0-9]{2})";
            boolean result = text.matches(reg);


            if (result) {
                System.out.println("Телефон успешно сохранен");
            } else {
                System.out.println("Ошибка ввода, попробуйте еще раз");
            }

        }
    }
}