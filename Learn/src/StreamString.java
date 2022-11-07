import java.util.stream.Stream;

//Необходимо список строк перевести в список чисел и произвести их умножение. Решите задачу, сначала используя обычный подход,
// а затем попробуйте написать тот же код на стримах.

public class StreamString {
    public static void main(String[] args) {
        int result = Stream.of("2","4","6")
                .map(Integer::parseInt)
                .reduce(1,(Integer, Integer2)->Integer*Integer2);
        System.out.println(result);
    }
}