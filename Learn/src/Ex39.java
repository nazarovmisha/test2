import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Напишите программу на Java для преобразования связанного списка в список массивов.
public class Ex39 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        List<String> newList = new ArrayList<>(list);
        System.out.println(newList);
    }
}