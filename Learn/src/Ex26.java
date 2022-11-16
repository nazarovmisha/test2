import java.util.Iterator;
import java.util.LinkedList;
//Напишите Java-программу для перебора всех элементов в связанном списке, начиная с указанной позиции.
public class Ex26 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Green");
        list.add("White");
        list.add("Black");

        Iterator iterator = list.listIterator(1);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}