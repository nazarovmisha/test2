import java.util.Optional;

public class OptionalMain3 {
    public static void main(String[] args) {

        Optional<Double> average = OptionalMain.average();
        System.out.println(average.orElse(Double.NaN));
        System.out.println(average.orElseGet(Math::random));
        System.out.println(average.orElseThrow(IllegalStateException::new));
    }
}