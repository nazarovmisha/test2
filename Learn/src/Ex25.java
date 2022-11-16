import java.util.LinkedList;
//Напишите Java-программу для перебора всех элементов в связанном списке.
public class Ex25 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.push("Orange");
        list.push("Green");
        list.push("White");
        list.push("Black");
        for (String element : list)
            System.out.println(element);
    }
}