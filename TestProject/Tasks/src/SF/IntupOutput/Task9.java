package SF.IntupOutput;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

    public void solution(String district, int fromYear, int toYear) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/crop_volumes.txt"));
        String[] headers = scanner.nextLine().split(";");
        String result = "Part;" + fromYear + ";" + toYear;

        while (scanner.hasNextLine()) {
            String[] element = scanner.nextLine().split(";");
            if (element[1].equals(district)) {

                int index1 = Arrays.asList(headers).indexOf(String.valueOf(fromYear));
                int index2 = Arrays.asList(headers).indexOf(String.valueOf(toYear));

                double fromYearResult = Double.parseDouble(element[index1]);
                double toYearResult = Double.parseDouble(element[index2]);

                if (fromYearResult < 1.04 * toYearResult) {
                    result += "\n" + element[0] + ";" + fromYearResult + ";" + toYearResult;
                }
            }
        }

        FileWriter writer = new FileWriter("Root/src/data.txt");
        writer.write(result);
        writer.flush();
    }
}
