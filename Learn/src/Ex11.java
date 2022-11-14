//Напишите программу на Java для перемешивания элементов в списке массивов.



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Green");
        list.add("Black");
        list.add("1");
        list.add("Brown");
        list.add("Red");
        list.add("16");
        list.add("Pink");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}