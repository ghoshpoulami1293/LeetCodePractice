package Assignment10Practice;

import java.util.Arrays;

public abstract class AbstractItems implements Items {
    Object[] items;       

    @Override
    public void addAll(Object[] items) {
       for(int i = 0; i<items.length;i++){
        add(items[i]);
       }
    }

    @Override
    public String toString() {
        return "AbstractItems [items=" + Arrays.toString(items) + "]";
    }

    public Object[] getItems() {
        return items;
    }   
}
