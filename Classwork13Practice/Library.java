package Classwork13Practice;
import java.util.List;

public class Library {
    private List<Patron> patrons;
    public void addPatron(Patron patron){
        patrons.add(patron);
    }
    public Patron getPatron(String id){
        for(Patron patron:patrons){
            if(patron.getId().equals(id)){
                return patron;
            }
        }return null;
    }
    public void addBook(String id, String title){
        Patron patron = getPatron(id);
        patron.addBook(title);
    }
    public void addFine(String id, float fine){
        Patron patron = getPatron(id);
        patron.addFine(fine);
    }
}
