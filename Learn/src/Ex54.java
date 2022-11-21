import java.util.TreeSet;
//Напишите программу на Java, чтобы получить первый и последний элементы в наборе деревьев.
public class Ex54{
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Orange");
        set.add("Green");
        set.add("White");
        set.add("White");
        set.add("Black");
        Object first = set.first();
        Object last = set.last();
        System.out.println(first);
        System.out.println(last);
    }
}