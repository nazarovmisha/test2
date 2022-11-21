import java.util.TreeSet;
//Напишите программу на Java, чтобы найти числа меньше 7 в наборе деревьев.
public class Ex55 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);

        TreeSet<Integer> newSet = (TreeSet<Integer>) set.headSet(7);
        for (Integer integer : newSet) {
            System.out.println(integer);
        }
    }
}