
import java.util.LinkedList;
//Напишите Java-программу для отображения элементов и их позиций в связанном списке.
public class Ex32 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");

        System.out.println("Original linked list:" + list);
        for (int p = 0; p < list.size(); p++) {
            System.out.println("Element at index " + p + ": " + list.get(p));
        }
    }
}