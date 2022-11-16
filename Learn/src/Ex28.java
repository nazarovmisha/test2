import java.util.LinkedList;
//Напишите Java-программу для вставки указанного элемента в указанную позицию в связанном списке
public class Ex28 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        list.set(2, "New white");
        System.out.println(list);
    }
}