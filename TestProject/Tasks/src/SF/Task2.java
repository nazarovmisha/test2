package SF;

import java.io.*;

public class Task2 {


    public static void main(String[] args) throws IOException{



        String fileName = "Root/files/asciitable.txt";
        FileInputStream fin = new FileInputStream(fileName);
        int c;
        int s = 0;
        while((c = fin.read()) != -1){
            if (c >='0' && c <= '9')
                s++;
        }
        System.out.println(s);
        fin.close();
    }
}
