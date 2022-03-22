package Thread;

import java.util.Optional;

public class Null {
    public static void main(String[] args) {
        String text = "Hello";
        Optional<String> opt = Optional.of(refactorText(text)); // строка 1
        System.out.println(opt.isPresent());
    }

    private static String refactorText(String text) {
        if (text.length() >= 5) {
            return null;
        } else {
            return text + " refactored";
        }
    }
}