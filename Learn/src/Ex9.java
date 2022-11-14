import java.util.ArrayList;
import java.util.List;

//Напишите программу на Java для копирования одного списка массивов в другой

public class Ex9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Green");
        list.add("Black");
        list.add("1");
        list.add("Brown");
        list.add("Red");
        list.add("16");
        list.add("Pink");
        System.out.println(list);
        List<String > newList=new ArrayList<>();
        newList.addAll(list);
        System.out.println(newList);
    }
}