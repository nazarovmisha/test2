import java.util.HashSet;

//Напишите программу на Java, чтобы получить количество элементов в хэш-наборе.
public class Ex46 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Green");
        set.add("White");
        set.add("Black");
        System.out.println( set.size());

    }
}