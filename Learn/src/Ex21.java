//Напишите программу на Java, чтобы увеличить размер списка массивов.

import java.util.ArrayList;

public class Ex21 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Green");
        list1.add("Black");
        list1.add("Brown");
        list1.add("Red");
        System.out.println(list1);
        list1.ensureCapacity(10);
        list1.add("Yellow");
        System.out.println(list1);
    }
}