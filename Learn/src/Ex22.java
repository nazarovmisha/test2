import java.util.ArrayList;
//Напишите Java-программу для печати всех элементов ArrayList, используя расположение элементов.

public class Ex22 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Green");
        list1.add("Black");
        list1.add("Brown");
        list1.add("Red");
        System.out.println("\nOriginal array list: " + list1);
        System.out.println("\nPrint using index of an element: ");
        int no_of_elements = list1.size();
        for (int index = 0; index < no_of_elements; index++)
            System.out.println(list1.get(index));
    }
}
