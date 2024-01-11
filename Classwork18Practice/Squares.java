package Classwork18Practice;

public class Squares {
    private Piece piece;

     public Squares() {
        this.piece = null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

   public void flip() throws BadMoveException{
    if(this.piece==null){
           throw new BadMoveException("empty square");
    }else {
        if(this.piece == Piece.BLACK){
            this.piece = Piece.WHITE;
        }
        else this.piece = Piece.BLACK;
    }

   }
    public void occupy(Piece piece) throws BadMoveException{
        if(this.piece!=null){
            throw new BadMoveException("Square already occupied");
        }
        this.piece = piece;
   }
   public boolean occupied(){
    return this.piece != null;  
   }
    
}
