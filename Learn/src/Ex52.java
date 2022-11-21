import java.util.HashSet;

//Напишите Java-программу для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
public class Ex52 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Green");
        set.add("White");
        set.add("White");
        set.add("Black");
        HashSet<String>set2 = new HashSet<>();
        set2.add("Orange");
        set2.add("Another Green");
        set2.add("White");
        set2.add("White");
        set2.add("Black");
        set.retainAll(set2);
        System.out.println(set);
    }
}