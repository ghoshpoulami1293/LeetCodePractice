package Assignment10Practice;

public interface Items {
    public void add( Object item ) ;        //adds a single object to the collection.
    public Object get( int index );         // returns an item at a specific index.
    public int size() ;                     // returns the number of items stored in the collection.
    public void addAll( Object[] items ) ;  //adds all of the elements in the array to the collection.
}
