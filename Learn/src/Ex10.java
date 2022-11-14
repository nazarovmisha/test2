//Напишите Java-программу для обновления определенного элемента массива по заданному элементу.

import java.util.ArrayList;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Green");
        list.add("Black");
        list.add("Brown");
        list.add("Red");
        list.add("Pink");
        System.out.println(list);
        list.set(1, "New Green");
        System.out.println(list);
    }
}