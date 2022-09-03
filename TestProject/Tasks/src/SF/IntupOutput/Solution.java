package SF.IntupOutput;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String str = "camelCasingTest";
        camelCase(str);
    }
    public static String camelCase(String input) {
        String[]result=input.split("(?=[A-Z])");
       String finalstring = String.join(" ",result);
       return finalstring;
    }

}
