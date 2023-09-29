package PracticeRNG;

import java.util.Random;

public class RNG {

    public static void main(String args[])
    {
        Random random1 = new Random();
        int  randomNumber= random1.nextInt(100);        
        System.out.println(randomNumber);

        //int count=1;
        //Boolean response = guessAccuracy(randomNumber,count);               
    } 
    
}
