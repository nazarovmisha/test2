import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Необходимо список строк перевести в список чисел и произвести их умножение. Решите задачу, сначала используя обычный подход,
// а затем попробуйте написать тот же код на стримах.

public class CollectionString {
    public static void main(String[] args) {
        List<String > list = Arrays.asList("2","4","6");
        List <Integer> resultColl = new ArrayList<>();

        for (String s : list){
            resultColl.add(Integer.parseInt(s));
        }
        int result=1;

        for (int i:resultColl){
            result*=i;
        }

        System.out.println(result);
    }
}