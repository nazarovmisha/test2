import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        int [] scores = {1,2,3,10};
        System.out.println(average(scores));
    }
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }
}