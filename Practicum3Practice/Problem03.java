package Practicum3Practice;

import java.io.*;
import java.net.Socket;

public class Problem03 {
    public void ReadWebSite(String server) throws IOException {
        Socket socket = new Socket(server, 80);

        InputStream in = socket.getInputStream();
        InputStreamReader inr = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(inr);

        OutputStream out = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(out);

        writer.println("GET / HTTP/1.1");
        writer.println("Host: " + server);
        writer.println();
        writer.flush();
        String line = reader.readLine();
        while (line != null){
            System.out.println(line);
            line = reader.readLine();
        }
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        Problem03 networking = new Problem03();
        System.out.println("Reading www.cnn.com now");
        networking.ReadWebSite("www.cnn.com");
        System.out.println("Reading www.se.rit.edu now");
        networking.ReadWebSite("www.se.rit.edu");
        System.out.println("Reading www.google.com now");
        networking.ReadWebSite("www.google.com");
    }
}