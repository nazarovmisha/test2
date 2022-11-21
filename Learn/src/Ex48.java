import java.util.HashSet;

//Напишите программу на Java, чтобы проверить, хэш-набор пуст или нет.
public class Ex48 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Green");
        set.add("White");
        set.add("Black");
        System.out.println(set.isEmpty());
        set.removeAll(set);
        System.out.println(set.isEmpty());
    }
}