// Напишите программу на Java для объединения двух списков массивов.

import java.util.ArrayList;
import java.util.List;

public class Ex16 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Green");
        list1.add("Black");
        list1.add("Brown");
        list1.add("Red");
        list1.add("Pink");

        List<String> list2 = new ArrayList<>();
        list2.add("Brown");
        list2.add("Red");
        list2.add("Pink");
        list2.add("Pig");

        List<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
    }
}