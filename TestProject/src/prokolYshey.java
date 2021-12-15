import java.util.Scanner;

public class prokolYshey {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Твой возраст");
        int Vozrast = scanner.nextInt();
        if (Vozrast < 14) {
            System.out.println("Пошел вон");
        } else if (Vozrast >= 14 && Vozrast < 18) {
            System.out.println("Прокол в присутствии родителей");
        } else {
            System.out.println("Коли что хочешь");
        }


    }
}
