package Classwork13Practice;

import java.util.Arrays;

public class HashMap<K,V> implements Map<K,V> {

    private Object[] entries;
    private int size;

    public HashMap(){
        entries=new Object[100];
        size=0;
    }

    //changed
    @Override
    @SuppressWarnings("unchecked")
    public void put(K key, V value) {
        //int hashCode = key.hashCode();//-2B, 2B
        int index= index(key);        
        //set search index = index
        //as long as the entry at search index is not null and 
        //the key in the entry is not the same as our key
            // add one to the search index
            // add one to the size of the table
        //id searchIndex ==index , the table is full
        int searchIndex= index;        
        while(entries[searchIndex]!=null)
        {
             Entry<K,V> entry = (Entry<K,V>)entries[searchIndex];
             if(entry.getKey().equals(key)){
                break;
            }         

             searchIndex = (searchIndex +1 )% entries.length;  
        }
        //check for full table               
        Entry<K,V> entry = new Entry<>(key, value);
        //entries[hashCode]=entry;
        entries[searchIndex]=entry;
        size+=1;
    }

    //changed
    @SuppressWarnings("unchecked")
    @Override
    public V get(K key) {
        //int hashCode = key.hashCode();
        int index= index(key);
        int searchIndex= index;        
        while(entries[searchIndex]!=null)
        {
             Entry<K,V> entry = (Entry<K,V>)entries[searchIndex];
             if(entry.getKey().equals(key)){
                break;
            }         
             searchIndex = (searchIndex +1 )% entries.length;  
        }
        //check for full table

        //Entry<K,V> entry = (Entry<K,V>)entries[hashCode];       
        Entry<K,V> entry = (Entry<K,V>)entries[searchIndex];
        if(entry== null || !entry.getKey().equals(key))
        {
            return null;
        }else{
             return entry.getValue(); 
        }              
    }
    @Override
    public int size() {
        return size;        
    }
    //added
    private int index(K key){
        int hashCode= key.hashCode();
        int index = hashCode % entries.length;
        return index<0?-index:index;
    }
    //added
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();
        map.put("abc",123);
        map.put("hermoine",3);
        map.put("Buttercup", 4);
         
        System.out.println(map.get("abc"));
        System.out.println(map.get("hermoine"));
        System.out.println(map.get("Buttercup"));
        
        System.out.println(Arrays.toString(map.entries));
    }
    
}
