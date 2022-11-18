import java.util.LinkedList;
//Напишите Java-программу для извлечения, но не удаления, первого элемента связанного списка.
public class Ex37 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");

        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list);
    }
}