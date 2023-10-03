package SelfStudy;

import java.util.Scanner;

public class Practice {
    public static void main(String args[]){
        int a;
        int b;
        float p;
        String x;
        String y;
        String c="Buttercup";
        String d="Buttercup";
        String e= "Butter"+"cup";
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a = ");
        a= scanner.nextInt();
        System.out.println("Enter b = ");
        b= scanner.nextInt();
        System.out.println("Enter p = ");
        p= scanner.nextFloat();
        
        System.out.println("Enter x = ");
        x= scanner.next();
        System.out.println("Enter y = ");
        y= scanner.next();

        System.out.println(c==d);//T
        System.out.println(c==e);//T
        System.out.println(x==y);//F
        System.out.println(a==b);//T
        System.out.println(b==p);//T
        scanner.close();
    
}
}

