//Напишите Java-программу, поменявшую два элемента в списке массивов

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex14 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Green");
        list1.add("Black");
        list1.add("Brown");
        list1.add("Red");
        list1.add("Pink");
        System.out.println(list1);
        Collections.swap(list1, 0, 2);
        System.out.println(list1);
    }
}