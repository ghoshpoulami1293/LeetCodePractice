package Homework14Practice;

public class Pokemon implements Comparable<Pokemon> {
    private int value;
    private String name;
    
    public Pokemon(String name,int value ) {
        this.value = value;
        this.name = name;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Pokemon [Name(number)=" + name + "(" + value + ")]";
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    @Override
    public boolean equals(Object object) {
       if(object instanceof Pokemon){
        Pokemon other = (Pokemon)object ;
        return this.value == other.value;
       }
       else return false;
    }
    
    @Override
    public int compareTo(Pokemon b){
        return (this.getValue() - b.getValue());
    }
    
}
