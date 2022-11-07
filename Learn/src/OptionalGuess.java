import java.util.Optional;
import java.util.Random;

//Напишите такой метод, который принимает 1 параметр типа int guess (догадка) в диапазоне от 1 до 5 и
// возвращает Optional<String> (выигрыш). Внутри метода реализуйте следующую логику:
//
//        если передаваемый guess не в требуемом диапазоне — бросайте IllegalStateException;
//        иначе: генерируйте рандомное значение int (для этого вам понадобится метод nextInt(int bound)
//        класса java.util.Random);
//        если сгенерированное значение равняется переданному значению guess,
//        тогда возвращайте Optional.of(“Поздравляем! Вы угадали значение!”));
//        если же нет — Optional.empty().
//        Протестируйте ваш метод из main(), обрабатывая Optional<String> как вы хотите.

public class OptionalGuess {
    public static void main(String[] args) {

        System.out.println(rand(2));
    }
    public static Optional<String> rand(int guess){
        if (guess<1||guess>5){
            throw new IllegalStateException();
        }
        else {
            int random = new Random().nextInt(5);
            System.out.println(random);
            if (guess == random){
                return Optional.of("Поздравляем! Вы угадали значение!");}
            else {
                return Optional.empty();
            }
        }
    }
}