import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTrue {
    public static void main(String[] args) {
        Stream<String> ohmY = Stream.of("Tigers", "Mouse", "lion", "Bee");
        Map<Boolean, List<String>> map = ohmY.collect(Collectors.groupingBy(s->s.length()<=5));
        System.out.println(map);
    }
}