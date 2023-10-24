package Assignment10Practice;

public class ArrayOfItems extends AbstractItems{    ;
    int size;   
    private int index = 0;

    public ArrayOfItems(int size) { 
        this.size=size;        
        items = new Object[size]; 
    }

    @Override
    public void add(Object item) {
        if(this.index<size){
            items[this.index]=item;
            index++;
        }
       else return;       
    }

    @Override
    public Object get(int index) {
        return items[index];
    }

    @Override
    public int size() {
        return this.index;
    }
    public static void main(String[] args) {
        ArrayOfItems arrayOfItems = new ArrayOfItems(5); 
        arrayOfItems.add(1);
        arrayOfItems.add("Hi"); 
        arrayOfItems.add(5); 
        arrayOfItems.add("Hola");
        Object[] obj = new Object[]{20,"What are you doing?",15};
        arrayOfItems.addAll(obj);
        System.out.println(arrayOfItems.toString());     
    }
}

