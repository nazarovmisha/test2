import java.util.HashSet;

//Напишите Java-программу для клонирования хеш-набора в другой хеш-набор.
public class Ex49 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Green");
        set.add("White");
        set.add("Black");
        HashSet<String> set2 = new HashSet<>();
        set2 = (HashSet<String>) set.clone();
        System.out.println(set2);
    }
}