//Напишите программу на Java для сравнения двух списков массивов.

import java.util.ArrayList;
import java.util.List;

public class Ex15 {
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
        for (String s : list1)
            list3.add(list2.contains(s)? "Yes":"No");
        System.out.println(list3);
    }
}

