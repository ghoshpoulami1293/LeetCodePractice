package Assignment10Practice;

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
        String elements="Items : ";
        for(int i =0; i<items.length;i++)
        {
            elements+= " " +items[i];
        }
        return elements;
    } 

    public Object[] getItems() {
        return items;
    }
    public void setItems(Object[] items) {
        this.items = items;
    }    
}
