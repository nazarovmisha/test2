package SF.Exception.HomeWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class HomeWork {

    public static void main(String[] args) throws IOException {
        List<String> lines = new ArrayList();
        try {
            lines = Files.readAllLines(Paths.get("D://borodino.txt"), UTF_8);
        } catch (IOException e){
            throw new IOException("File not found");
        }

        Scanner in = new Scanner(System.in);
        int n;

        try {
            System.out.println("Введите номер строки в диапазоне 1.." + lines.size());
            n = in.nextInt();
        }catch (InputMismatchException e){
            throw new InputMismatchException("Вы ввели не число");
        }
        catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("Число вне диапазона");
        }

        System.out.println("Вот предсказание для вас:\n" + lines.get(n - 1));
    }
}


