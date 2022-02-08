package SF.IntupOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task5 {

    public boolean arePalindromes() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/strings.txt"));
        while (scanner.hasNextLine()) {

            String palindromes = scanner.nextLine();
            palindromes = palindromes.toLowerCase().replace(" ", "");
            if (!palindromes.equals(new StringBuilder(palindromes.toLowerCase()).reverse().toString()))
                return false;
        }
        return true;
    }
}
