package Assignment10Practice;

public class ListOfItems extends AbstractItems{
   private Node head;
   private Node tail;
   private int size=0;

    @Override
    public void add(Object item) {
       if(size==0){ 
            Node node = new Node();
            node.setItem(item);
            head = node;
            tail = node;            
            size++;
        }
       else{
        Node node = new Node();
        node.setItem(item);
        tail.setNext(node);
        tail= node;
        size++;
       }
    }

    @Override
    public Object get(int index) {
       Node node = new Node();
       for (int i =0;i<index;i++){
        node = head.getNext();
       }
       return node.getItem();
    }

    @Override
    public int size() {
       return this.size;
    }

    @Override
    public void addAll(Object[] items)
    {  
        for(int i =0;i<items.length;i++) {
           add(items);
        } 
    }

    @Override
    public String toString() {
        return "ListOfItems [head=" + head + ", tail=" + tail + ", size=" + size + "]";
    }
    
}
