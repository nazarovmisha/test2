package Stream;

import java.util.stream.Stream;

public class StringToIntStream {
    public static void main(String[] args) {


        int result = Stream.of("12", "15", "27")
                .map(Integer::parseInt)
                .reduce(1, ((integer, integer2) -> integer * integer2));
        System.out.println(result);
    }
}
