import java.util.LinkedList;

//Напишите программу на Java для замены элемента в связанном списке.
public class Ex43{
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Orange");
        list1.add("Green");
        list1.add("White");
        list1.add("Black");
        System.out.println(list1);
        list1.set(1,"New green");
        System.out.println(list1);
    }
}
