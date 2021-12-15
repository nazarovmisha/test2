import java.util.Random;
import java.util.Scanner;

public class SayNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randlint;
        randlint = rand.nextInt();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < randlint) {
            System.out.println("Введеное число меньше");
        } else if (x == randlint) ;
        System.out.println("Угадал");
    }

}

