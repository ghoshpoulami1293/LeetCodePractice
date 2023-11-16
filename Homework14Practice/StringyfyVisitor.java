package Homework14Practice;

public class StringyfyVisitor<T> implements Visitor<T>{
    private StringBuilder builder;

    public StringyfyVisitor(){
        builder = new StringBuilder();
    }

    @Override
    public void visit(BinaryNode<T> node){
        builder.append(node.getValue());
        builder.append(" ");
    }

    @Override
    public String toString(){
        return builder.toString();
    }
}
