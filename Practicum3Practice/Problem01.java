package Practicum3Practice;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Problem01 {
    public static void ProcessFile(String name) throws FileNotFoundException {
        File file = new File(name);
        if(!file.exists()){
            System.out.println("Input file does not exist: " + name);
            System.exit(1);
        }
        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[10240];
            int num = 1;
            long count = 0;
            long sum = 0;
            while(num > 0){
                num = fileInputStream.read(bytes);
                if(num > 0){
                    count += num;
                    for(int i = 0; i < num; i++){
                        sum += bytes[i];
                    }
                }
        }
            System.out.println("sum" + sum);
            System.out.println("count" + count);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        ProcessFile("data/alice_in_wonderland.txt");
    }
}