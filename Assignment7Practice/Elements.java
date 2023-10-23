package Assignment7Practice;

public class Elements {
    private String name;
    private String symbol;
    private int atomicnumber;
    private double atomicweight;
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
    public int getAtomicnumber() {
        return atomicnumber;
    }
    public void setAtomicnumber(int atomicnumber) {
        this.atomicnumber = atomicnumber;
    }
    public double getAtomicweight() {
        return atomicweight;
    }
    public void setAtomicweight(double atomicweight) {
        this.atomicweight = atomicweight;
    }
    public Elements(String name, String symbol, int atomicnumber, double atomicweight) {
        this.name = name;
        this.symbol = symbol;
        this.atomicnumber = atomicnumber;
        this.atomicweight = atomicweight;
    }
    @Override
    public String toString() {
        return "Elements [name=" + name + ", symbol=" + symbol + ", atomicnumber=" + atomicnumber + ", atomicweight="
                + atomicweight + "]";
    } 
    
}
