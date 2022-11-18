import java.util.LinkedList;
//Напишите Java-программу для удаления и возврата первого элемента связанного списка.
public class Ex38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        System.out.println("Removed element: "+list.pop());
        System.out.println(list);
    }