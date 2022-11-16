import java.util.Collections;
import java.util.LinkedList;

//Напишите программу на Java, которая поменяет два элемента в связанном списке.
public class Ex36 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        Collections.swap(list, 0, 3);
        System.out.println(list);
    }
}