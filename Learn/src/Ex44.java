import java.util.HashSet;

//Напишите Java-программу для добавления указанного элемента в конец хеш-набора.
public class Ex44 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Orange");
        set.add("Green");
        set.add("White");
        set.add("Black");
        System.out.println(set);

        set.add("Blue");
        System.out.println(set);
    }
}