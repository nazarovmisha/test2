
import java.util.LinkedList;

//Напишите программу на Java, чтобы проверить, существует ли определенный элемент в связанном списке.
public class Ex40 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        System.out.println(list.contains("Green"));
        System.out.println(list.contains("New green"));

    }
}