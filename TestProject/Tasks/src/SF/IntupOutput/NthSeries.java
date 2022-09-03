package SF.IntupOutput;


public class NthSeries {
    public static void main(String[] args) {
        int z = 24;
        seriesSum(z);
    }

    public static String seriesSum(int n) {
        double[] arr = new double[n];
        double x = 0;
        double result = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = 1 / (1 + x);
            x += 3;
            result += arr[i];
        }

        String output = String.format("%.2f",result);
       System.out.println(output);
        return output;
    }
}