package Classwork12Practice;

public class GenericArray<E> {
    private Object[] array;
    
    //constructor
     public GenericArray() {
        this.array = new Object[10];
    }

    //accessors and mutators   
    public Object[] getArray() {
        return array;
    }
    public void setArray(Object[] array) {
        this.array = array;
    }    

    //methods for GenericArray

    //add value at index zero
    public void add(E value){
        array[0]= value;
    }

    //get value from a mentioned index
    @SuppressWarnings("unchecked")
    public E getValue(int index){
        E value = (E)array[index]; // typecasting is necessary
        return value;
    }
}
