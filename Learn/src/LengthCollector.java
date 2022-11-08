import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LengthCollector {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("Tiger", "Lion", "Wolf");

        Map<Integer,String> map = ohMy.collect(Collectors.toMap(
                String::length,
                k->k,
                (s1,s2)->s1 + ","+ s2
        ));
        System.out.println(map.getClass());
        System.out.println(map);
    }
}