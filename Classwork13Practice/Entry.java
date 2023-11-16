package Classwork13Practice;
class Entry<K,V> {
    private K key;
    private V value;

    Entry(K key,V value){
        this.key= key;
        this.value= value;
    }

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }

    @Override
    public String toString(){
        return key+":"+value;
    }
}
