import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("VVEDITE IMYA POLZOVATELYA");
        String imya = scanner.nextLine();
        System.out.println("VVEDITE PAROL'");
        String parol = scanner.nextLine();
        if (parol.length() < 8 || parol.length() > 15)
        {
            do {
                System.out.println("Parol dolgen bit ot 8 do 15 simvolov");
                parol = scanner.nextLine();
            } while (parol.length() < 8 || parol.length() > 15);
        }
        System.out.printf("%s, Ваш новый пароль: %s", imya, parol);
    }


}

