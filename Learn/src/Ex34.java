import java.util.LinkedList;

//Напишите программу на Java для удаления первого и последнего элемента из связанного списка.
public class Ex34 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}