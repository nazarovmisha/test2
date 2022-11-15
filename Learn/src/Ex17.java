import java.util.ArrayList;

//Напишите Java-программу для клонирования списка массивов в другой список массивов.

public class Ex17 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Green");
        list1.add("Black");
        list1.add("Brown");
        list1.add("Red");
        list1.add("Pink");

        ArrayList<String> newList = (ArrayList<String>)list1.clone();
        System.out.println(newList);
    }
}