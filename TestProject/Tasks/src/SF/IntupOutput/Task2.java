package SF.IntupOutput;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws FileNotFoundException {
        Task2 t = new Task2();
        t.getCountWords();
    }

    public int getCountWords() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/text.txt"));
        int i = 0;
        while (scanner.hasNextLine()) {
            String[] result = scanner.nextLine().split(" ");
            i += result.length;
        }
        return i;
    }
}
