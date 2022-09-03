package SF.IntupOutput;

public class Kata {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4};
        grow(arr);
    }

    public static int grow(int[] x) {
        int summ =1 ;
        for (int i = 0; i < x.length; i++) {

            summ *= x[i];


        }
        return summ;
    }

}
