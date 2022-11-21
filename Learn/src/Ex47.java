import java.util.HashSet;
//Напишите программу на Java, чтобы очистить хэш-набор.
public class Ex47 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Green");
        set.add("White");
        set.add("Black");
        System.out.println(set);
        set.removeAll(set);
        System.out.println(set);
    }
}