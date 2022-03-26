package Stream;

import java.util.ArrayList;
import java.util.List;

public class StringToInt {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("15");
        arrayList.add("17");
        arrayList.add("26");
        System.out.println(arrayList);
        List<Integer> arrayListInt = new ArrayList<>();
        for (String s:arrayList){
            arrayListInt.add(Integer.parseInt(s));
        }
        System.out.println(arrayListInt);
    }
}