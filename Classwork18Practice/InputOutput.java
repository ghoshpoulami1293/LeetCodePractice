package Classwork18Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class InputOutput {
    

     public static void writeSquares(List<Squares> squares, String filename)throws IOException{
       FileWriter filewriter = new FileWriter(filename);
       PrintWriter printwriter = new PrintWriter(filewriter);

       for(Squares square : squares){
            printwriter.write(square.toString());
       }
       printwriter.flush();
       printwriter.close();
    }

    public static List<Squares> readSquares(String filename)throws IOException, BadMoveException{
        FileReader fr= new FileReader(filename);
        BufferedReader bufferedreader = new BufferedReader(fr);

        List<Squares> squares = new ArrayList<>();
        String line = bufferedreader.readLine();//read 1st line
        while(line!=null){
            for(char c : line.toCharArray()){ //line turned to char array  
                Squares square = new Squares();
                if(c=='B'){
                    square.occupy(Piece.BLACK);
                }else if(c=='C'){
                    square.occupy(Piece.WHITE);
                }
                squares.add(square);
            }
            line= bufferedreader.readLine();//check next line
        }
        bufferedreader.close();
        return squares;
    }
}
