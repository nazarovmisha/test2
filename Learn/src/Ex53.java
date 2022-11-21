import java.util.Iterator;
import java.util.TreeSet;

//Напишите программу на Java для создания представления в обратном порядке элементов, содержащихся в данном наборе деревьев.
public class Ex53 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Orange");
        set.add("Green");
        set.add("White");
        set.add("White");
        set.add("Black");
        Iterator<String> it = set.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}