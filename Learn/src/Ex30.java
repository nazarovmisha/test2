//Напишите программу на Java для вставки некоторых элементов в указанной позиции в связанный список.

import java.util.LinkedList;

public class Ex30 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        LinkedList<String> newList = new LinkedList<>();
        newList.add("Blue");
        newList.add("Yellow");
        list.addAll(1, newList);
        System.out.println(list);
    }
}