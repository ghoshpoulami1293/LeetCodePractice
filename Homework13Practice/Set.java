package Homework13Practice;
import java.util.Iterator;

public interface Set<E> {
    void add( E value);
    E remove(E value);
    int size();
    Iterator<E> iterator();
    boolean contains(E element);
    
}
