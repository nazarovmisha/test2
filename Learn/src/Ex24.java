import java.util.LinkedList;
//Напишите Java-программу для добавления указанного элемента в конец связанного списка.
public class Ex24 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        list.add("Blue");
        System.out.println(list);
    }
}