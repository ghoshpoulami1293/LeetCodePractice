package Finals;

import java.util.Scanner;

public class ObjectEquality {
    
public static void main(String[] args) {
        int x=5;
        int y= 5;

        System.out.println(x==y);//true
        System.out.println(x==5);//true
        System.out.println(5==y);//true

        float z= 5.0f;
        System.out.println(x==z);//true

        z= 5.25f;
        System.out.println(x==z);//false
    
    
    String a="Buttercup";
    String b="Buttercup";
    String c="Thunder";
    String d="Hermoine";
    String e="Herm" + "oine";

    String f = "Butt";
    f+= "ercup";

        System.out.println(a==b);//true
        System.out.println(a==c);//false
        System.out.println(d==e);//true
        System.out.println(a==f);//false 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name = ");
        String name = scanner.nextLine();
        System.out.println(a==name);
        scanner.close();
}
//deep euality = equals
//shallow equality = ""
}