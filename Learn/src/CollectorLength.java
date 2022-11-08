import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorLength {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("Tiger", "Lion", "Bear");

        Map<String,Integer> result = ohMy.collect(Collectors.toMap(s->s, String::length));
        System.out.println(result);
    }
}