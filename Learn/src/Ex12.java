import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Напишите Java-программу для обращения элементов в списке массивов.
public class Ex12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Green");
        list.add("Black");
        list.add("Brown");
        list.add("Red");
        list.add("Pink");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}