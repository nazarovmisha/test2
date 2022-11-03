import java.util.Optional;

public class OptionalMain2 {
    public static void main(String[] args) {

        Optional<Double> average = OptionalMain.average(10,100);
        average.ifPresent(System.out::println);
    }
}