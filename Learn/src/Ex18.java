//Напишите программу на Java, чтобы очистить список массивов.

import java.util.ArrayList;

public class Ex18 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Green");
        list1.add("Black");
        list1.add("Brown");
        list1.add("Red");
        list1.add("Pink");

        list1.clear();
        System.out.println(list1);
    }
}