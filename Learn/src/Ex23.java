import java.util.ArrayList;
//Напишите программу на Java, чтобы заменить второй элемент ArrayList указанным элементом.
public class Ex23 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Green");
        list1.add("Black");
        list1.add("Brown");
        list1.add("Red");
        System.out.println(list1);
        list1.set(1, "New green");
        System.out.println(list1);
    }
}