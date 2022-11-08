import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAnimal {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("Tiger", "Lion", "Bear");
        String result = ohMy.collect(Collectors.joining(","));
        System.out.println(result);
    }
}