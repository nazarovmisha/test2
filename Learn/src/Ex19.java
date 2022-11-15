import java.util.ArrayList;

public class Ex19 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Green");
        list1.add("Black");
        list1.add("Brown");
        list1.add("Red");
        list1.add("Pink");
        System.out.println(list1.isEmpty());
        list1.clear();
        System.out.println(list1);
        System.out.println(list1.isEmpty());
    }
}