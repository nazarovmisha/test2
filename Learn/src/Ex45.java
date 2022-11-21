import java.util.HashSet;

//Напишите Java-программу для перебора всех элементов в хэш-списке.
public class Ex45 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Green");
        set.add("White");
        set.add("Black");
        for (String e : set)
            System.out.println(e);

    }
}