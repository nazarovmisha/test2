//Напишите программу на Java для поиска элемента в списке массивов.

import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Green");
        list.add("Black");
        list.add("Brown");
        list.add("Red");
        list.add("Pink");

        int number =  list.indexOf("Green");

        System.out.println(number);
    }
}