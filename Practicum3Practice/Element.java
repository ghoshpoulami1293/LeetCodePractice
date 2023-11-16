package Practicum3Practice;

import java.util.Comparator;
import java.util.TreeSet;

public class Element implements Comparator<Element>
{
    int number;
    String name;
    String symbol;
    double atomic_mass;


    public Element(int number, String name, String symbol, double atomic_mass) {
        this.number = number;
        this.name = name;
        this.symbol = symbol;
        this.atomic_mass = atomic_mass;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getAtomic_mass() {
        return atomic_mass;
    }

    public void setAtomic_mass(int atomic_mass) {
        this.atomic_mass = atomic_mass;
    }

    @Override
    public String toString() {
        return "Element{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomic_mass=" + atomic_mass +
                '}';
    }

    @Override
    public int compare(Element o1, Element o2) {
        return o1.name.compareTo(o2.name);
    }

}
