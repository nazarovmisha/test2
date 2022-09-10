package SF.IntupOutput;

public class Controller {
    public static void main(String[] args) {
        String[] result = new String[5];
        int[][] point = {
                {1, 2, 4, 8, 8},
                {5, 5, 5, 5, 5},
                {5, 4, 5, 4, 5},
                {2, 4, 4, 2, 5},
                {2, 3, 5, 5, 5},
        };
        String[] names = {"Alex", "Serg", "Phil", "Nicola", "Mike"};
        int[] summPoints = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < point[i].length; j++) {
                summPoints[i] += point[i][j];
            }
            result[i]=summPoints[i]+names[i];
            System.out.println(result[i] );
        }
    }
}
