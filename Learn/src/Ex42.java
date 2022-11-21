import java.util.LinkedList;

//Напишите Java-программу для проверки того, что связанный список пуст или нет.
public class Ex42 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Orange");
        list1.add("Green");
        list1.add("White");
        list1.add("Black");
        System.out.println(list1.isEmpty());
        list1.removeAll(list1);
        System.out.println(list1.isEmpty());
    }
}