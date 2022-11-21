import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Напишите Java-программу для преобразования хэш-набора в набор деревьев.
public class Ex51 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Green");
        set.add("White");
        set.add("White");
        set.add("Black");
        Set<String> newSet = new TreeSet<>(set);
        for (String e : newSet)
            System.out.println(e);
    }
}