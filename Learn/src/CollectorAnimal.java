import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorAnimal {
    public static void main(String[] args) {
        Stream<String> my = Stream.of("Tiger", "Bear", "Lion");
        double result = my.collect(Collectors.averagingInt(String::length));
        System.out.println(result);
    }
}