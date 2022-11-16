import java.util.Iterator;
import java.util.LinkedList;
//Напишите Java-программу для итерации связанного списка в обратном порядке.
public class Ex27 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");

        Iterator iterator = list.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}