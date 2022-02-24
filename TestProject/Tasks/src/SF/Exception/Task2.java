package SF.Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        try {
            while (true){
                list.add(Integer.parseInt(reader.readLine()));
            }
        } catch (Exception e){
            for (Integer i:list){
                System.out.println(i);
            }
        }
    }
}