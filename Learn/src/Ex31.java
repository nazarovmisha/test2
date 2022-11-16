import java.util.LinkedList;
//Напишите программу на Java, чтобы получить первое и последнее вхождение указанных элементов в связанный список.
public class Ex31 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");

        Object firstElement = list.getFirst();
        System.out.println("First element : " + firstElement);

        Object lastElement = list.getLast();
        System.out.println("Last element : " + lastElement);
    }
}