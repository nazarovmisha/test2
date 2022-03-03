package Thread;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);
        while (true) {


            System.out.println("Waiting ...");

            Socket socket = server.accept();
            System.out.println("Client connected!");

            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            Scanner in = new Scanner(is);
            PrintStream out = new PrintStream(os);

            out.println("Welcome to mountains!");
            String input = in.nextLine();
            while (!input.equals("Bye")) {
                out.println(input + "-" + input + "-" + input.substring(input.length() / 2) + "...");
                input = in.nextLine();
            }
            socket.close();

        }
    }
}
