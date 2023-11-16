package Homework13Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapSet<E> implements Set<E> {
    private Map<E,Object> hashMap; 
    private int size;

    MapSet(){
        hashMap = new HashMap<E,Object>();
        size=0;
    }

    @Override
    public void add(E value) {
        if(contains(value)) {               //properties of set - cannot contain duplicates
            return;
        } 
        hashMap.put(value, null);
        size++;
    }

    @Override
    public E remove(E value) {              //remove the key value pair
       if(hashMap.containsKey(value)){
        hashMap.remove(value);
        size--;
        return value;
       }
       else return null;
    
    }

    @Override
    public int size() {
       return this.size();                                      // return size;
    }

    @Override
    public Iterator<E> iterator() { 
        return (Iterator<E>) hashMap.keySet().iterator();       // return keyset iterator
    }

    @Override
    public boolean contains(E element) {
       if(hashMap.containsKey(element)){                        // if the hashmap cobtains the key
        return true;
       }return false;
    }
    
}
