import java.util.HashMap;
import java.util.Map;

//Напишите программу на Java, чтобы связать указанное значение с указанным ключом в HashMap.
public class Ex57 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Blue");
        hashMap.put(3, "White");
        hashMap.put(4, "Green");
        hashMap.put(5, "Black");
        for (Map.Entry x : hashMap.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}