import java.util.Arrays;
import java.util.List;

//Давайте решим следующую задачу: необходимо в списке отобрать первые 2 строки в алфавитном порядке, 
// которые имеют длину 4.

public class AnyStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mike", "Tony", "Sergey", "Ann");
        list.stream().
                filter(n -> n.length() == 4).
                sorted().
                limit(2).
                forEach(System.out::println);
    }
}