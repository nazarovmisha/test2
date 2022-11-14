import java.util.ArrayList;
import java.util.List;

//Напишите Java-программу для итерации всех элементов списка массивов.

public class Ex2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Green");
        list.add("Black");
        list.add("Brown");
        list.add("Red");
        list.add("Pink");

        for (String element :list){
            System.out.println(element);
        }
    }
}