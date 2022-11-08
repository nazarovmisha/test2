import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTreeSet {
    public static void main(String[] args) {
        Stream<String> myColl = Stream.of("Tiger", "Lion", "Bear");
        TreeSet<String> result = myColl.filter(s -> s.startsWith("T"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(
                result
        );
    }
}