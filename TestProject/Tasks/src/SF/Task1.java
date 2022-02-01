package SF;

import java.io.*;

public class Task1 {

    public static void main(String[] args) throws IOException {


        String fileName = "Root/files/answer.txt";
        FileInputStream fis = new FileInputStream(fileName);
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();

    }
}
