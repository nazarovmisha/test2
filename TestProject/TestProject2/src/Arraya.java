import java.util.Arrays;
import java.util.Scanner;

public class Arraya {
    public static void main(String[] args) {

        String[] result = new String[5];
        int[][] points = {
                {2, 4, 5, 2, 4},
                {1, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {2, 3, 4, 3, 2},
                {5, 2, 1, 4, 5},
        };
        int[] sumPoints = new int[5];
        String[] names = {"Alex", "Igor", "Michael", "Nicolay", "Vladimir" };
        for (int i = 0; i < sumPoints.length; i++) {
            for (int j = 0; j < names.length; j++) {
                sumPoints[i] += points[i][j];
            }
                result[i]=names[i]+sumPoints[i];
                System.out.println(result[i]);
            }
        }

    }


