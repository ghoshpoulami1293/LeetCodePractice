package Classwork18Practice;
public enum Piece {
WHITE('W'),
BLACK('B');
 
public final char symbol;

Piece(char symbol){
    this.symbol = symbol;
}

@Override
public String toString() {
return Character.toString(symbol);
}
}
