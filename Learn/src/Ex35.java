import java.util.LinkedList;

//Напишите программу на Java, чтобы удалить все элементы из связанного списка.
public class Ex35 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        list.removeAll(list);
        System.out.println(list);
    }
}