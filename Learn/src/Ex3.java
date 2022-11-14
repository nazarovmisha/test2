//Напишите Java-программу для вставки элемента в список массивов в первой позиции.

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex3 {
    public static void main(String[] args) {
        Deque<String> list = new ArrayDeque<>();
        list.add("White");
        list.add("Green");
        list.add("Black");
        list.add("Brown");
        list.add("Red");
        list.add("Pink");
        list.push("First White");
        System.out.println(list);
    }
}