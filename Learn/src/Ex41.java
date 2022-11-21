
import java.util.LinkedList;

//Напишите программу на Java для сравнения двух связанных списков.
public class Ex41 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Orange");
        list1.add("Green");
        list1.add("White");
        list1.add("Black");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Orange");
        list2.add("Another Green");
        list2.add("White");
        list2.add("Black");

        LinkedList<String> list3 = new LinkedList<>();
        for (String e : list1)
            list3.add(list2.contains(e) ? e:"Not contains");
        System.out.println(list3);



    }
}