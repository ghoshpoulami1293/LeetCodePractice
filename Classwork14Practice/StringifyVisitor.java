package Classwork14Practice;

public class StringifyVisitor implements Visitor{
    //build the string while traversing
    private StringBuilder stringbuilder;

    
    public StringifyVisitor() {
        this.stringbuilder = new StringBuilder();
    }

    @Override
    public String toString() {
        return stringbuilder.toString();
    }

    @Override
    public void visit(BinaryNode node) {
      stringbuilder.append(node.getValue());
      stringbuilder.append(" ");
    }    
}
