package SF.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Num {
    public static void main(String[] args) {
        List<Integer> numList = new LinkedList<>();

        for (int i = 0; i < 100; i++){
        numList.add(i);
    }
    for (int i =0, j = 99; i< 50&& j>=50; i++, j--){
        int start = numList.get(i);
        int finish = numList.get(j);
        numList.set(j,start);
        numList.set(i,finish);
    }
        System.out.println(numList);
}
}