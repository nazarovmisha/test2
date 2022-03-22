package Thread;

import java.util.Optional;
import java.util.Random;
import java.util.Scanner;


public class Guess {

    public static void main(String[] args) {
        Guess guess = new Guess();
        guess.checkGuess();
    }

    public Optional<String> checkGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");

        int guess = scanner.nextInt();
        if (1 > guess || guess > 5) {
            throw new IllegalStateException();
        }
        int result = new Random().nextInt(5) + 1;
        if (guess == result) {
            return Optional.of("Поздравляем! Вы угадали значение!");
        } else {
            return Optional.empty();
        }
    }
}






