package Assignment10Practice;

public class ItemsTest {
    public static void testItems(Items items){
        if(items instanceof ArrayOfItems)//when the class is ArrayOfitem
        {
            items.add("Hi"); 
            items.add("Welcome");
            items.add("to RIT");
            items.add("Fall Semester");
            items.add(2023);
            Object[] array = new Object[]{"Poulami ","Ghosh ","RIT ","West Henrietta"};
            items.addAll(array);

            System.out.println(items);
            System.out.println(items.get(4)); 
            System.out.println(items.size()); 
            
            items.add("test1");
            items.add("test2");
            items.add("test3");

            //elements beyond size =10
            items.add("test4-beyond");
            items.add("test5-beyond");
            items.add("test6-beyond");
            System.out.println(items);
        }
        else if(items instanceof ListOfItems){
             
            items.add("This is List of Items testing");
            items.add(10);
            Object[] list = new Object[]{"I","am","enjoying"};
            items.addAll(list);

            System.out.println(items); 
            System.out.println(items.get(3));
            System.out.println(items.size()); 
        }
    }
    public static void main(String[] args) {
        ArrayOfItems arrayOfitems = new ArrayOfItems(10); 
        testItems(arrayOfitems); 

        ListOfItems listOfItems = new ListOfItems();        
        testItems(listOfItems);
    }
}
