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
        System.out.println("Waiting ...");

        Socket s = server.accept();
        System.out.println("Client connected!");

        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();

        Scanner in = new Scanner(is);
        PrintStream out = new PrintStream(os);

        out.println("What is our name?");
        out.println("Hello," + in.nextLine());


    }
}
