import java.util.Arrays;
import java.util.HashSet;
//Напишите Java-программу для преобразования хэш-набора в массив.
public class Ex50 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Green");
        set.add("White");
        set.add("Black");
        String[] arr = new String[set.size()];
        set.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}