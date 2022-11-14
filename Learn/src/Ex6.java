import java.util.ArrayList;
import java.util.List;

//Напишите программу на Java для удаления третьего элемента из списка массивов.
public class Ex6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Green");
        list.add("Black");
        list.add("Brown");
        list.add("Red");
        list.add("Pink");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}