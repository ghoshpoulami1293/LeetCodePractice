package Homework13Practice;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap1 =new HashMap<>();

        hashMap1.put("Harry",125);        
        hashMap1.put("Buttercup", 492);
        hashMap1.put("Dumbledore",125);       
        hashMap1.put("Hagred", 492);

        //Add two different values using the same key. 
        hashMap1.put("Hermoine",343);
        System.out.println(hashMap1.get("Hermoine"));   

        hashMap1.put("Hermoine",678);
        System.out.println(hashMap1.get("Hermoine")); 

        System.out.println(hashMap1.size()); //print size

        //Iterate over the keys in the map and print the values
        for(String key: hashMap1.keySet()){
            System.out.println("key = " + key + "item : "+hashMap1.get(key) );
        }
    }         
}
