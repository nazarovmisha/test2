
import java.util.LinkedList;
//Напишите Java-программу для удаления указанного элемента из связанного списка.
public class Ex33 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");

        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}