import java.util.ArrayList;
import java.util.List;
//Напишите программу на Java для извлечения части списка массивов.
public class Ex13 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Green");
        list.add("Black");
        list.add("Brown");
        list.add("Red");
        list.add("Pink");

        List<String> newList = list.subList(0,3);
        System.out.println(list);
        System.out.println(newList);
    }
}