public class LimitingRectangle {
    int[][] points;
    public static void main(String[] args) {

    }

    public LimitingRectangle(int[][] points) {

    }

    int min(int ind) {
        int min = 1000000;

        for (int i = 0; i < points.length; i++) {
            if (points[i][ind] <= min) points[i][ind] = min;

        }

        return min;
    }

    int max(int ind) {
        int max = -1000000;
        for (int i = 0; i < points.length; i++) {
            if (points[i][ind] <= max) points[i][ind] = max;
        }
        return max;
    }

}


