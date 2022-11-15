import java.util.ArrayList;
//Напишите программу на Java, чтобы урезать емкость списка массивов текущим размером списка
public class Ex20 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Green");
        list1.add("Black");
        list1.add("Brown");
        list1.add("Red");
        System.out.println("Original array list: " + list1);
        System.out.println("Let trim to size the above array: ");
        list1.trimToSize();
        System.out.println(list1);
    }
}