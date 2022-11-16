import java.util.LinkedList;

//Напишите программу на Java для вставки элементов в связанный список в первой и последней позиции.
public class Ex29 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");

        System.out.println(list);

        list.add("Yellow");
        list.push("Blue");

        System.out.println(list);
    }
}