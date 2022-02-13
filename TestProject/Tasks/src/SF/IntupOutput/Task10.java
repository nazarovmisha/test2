package SF.IntupOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task10 {
    public double findSquare() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/points.txt"));
        String[] prevPoints = scanner.nextLine().split(" ");
        double square = 0;
        while (scanner.hasNextLine()) {
            String[] nowPoints = scanner.nextLine().split(" ");
            int prevX = Integer.parseInt(prevPoints[0]);
            int prevY = Integer.parseInt(prevPoints[1]);

            int nowX = Integer.parseInt(nowPoints[0]);
            int nowY = Integer.parseInt(nowPoints[1]);

            double a = prevY;
            double b = nowY;
            double h = nowX - prevX;

            square += (a + b) / 2 * h;
            prevPoints = nowPoints;
        }
        return square;
    }
}
