package SF.IntupOutput;

import java.awt.font.FontRenderContext;
import java.util.Arrays;

public class CountDig {
    public static void main(String[] args) {
        int n = 10;
        int d = 1;
        int i = 0;
        nbDig(n, d);
    }

    public static int nbDig(int n, int d) {
        int tmp = 0;
        int a = 0;

        char[]ch =new char[10000];
        int[] newarr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            newarr[i] = i * i;
        }
        for(int i=0;i<newarr.length;i++){

            while(a>0) {
                i.insert(0, a%10);
                a = a / 10;
            }
        }



        System.out.println(Arrays.toString(newarr));
        return tmp;
    }

}



