import java.util.ArrayList;
import java.util.List;
//Напишите программу на Java, чтобы создать новый список массивов, добавить несколько цветов (строку) и распечатать коллекцию
public class Ex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Green");
        list.add("Black");
        list.add("Brown");
        list.add("Red");
        list.add("Pink");
        System.out.println(list);
    }
}