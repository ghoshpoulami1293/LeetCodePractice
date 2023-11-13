package Classwork13Practice;
import java.util.ArrayList;
import java.util.List;

public class Patron {
    private final String id;
    private final String name;
    private double fines;
    private List<String> books;

    //constructor
    public Patron(String id, String name, double fines) {
        this.id = id;
        this.name = name;
        this.fines = 0.0d;
        this.books = new ArrayList<>();
    }

    //Setters and getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getFines() {
        return fines;
    }
    public void setFines(double fines) {
        this.fines = fines;
    }
    public List<String> getBooks() {
        return books;
    }
    public void setBooks(List<String> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Patron [Id=" + id + ", name=" + name + ", fines=" + fines + ", books=" + books + "]";
    } 
    
    //methods
    public void addBook(String book){
        books.add(book);
    }
    public void removeBook(String book){
        books.remove(book);
    }
    public void addFine(double fine){
         this.fines+=fine;
    }
    public void removeFine(double fine){
        this.fines-=fine;
    }

    //equals method - practice
    public boolean equals(Object object){
        if(object instanceof Patron){ // if object is of type Patron
            Patron other = (Patron) object; 
            return this.id.equals(other.id);
        }return false;
    }
    //hashcode method
    
}
