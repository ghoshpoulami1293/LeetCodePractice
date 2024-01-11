package Classwork18Practice;

public class BadMoveException extends Exception {
    public BadMoveException(String message){
        super(message);
    }
    public BadMoveException(Throwable cause){
        super(cause);
    }
    public BadMoveException(Throwable cause, String message){
        super(message , cause);
    }
    public static void main(String[] args) throws BadMoveException {
        BadMoveException bme = new BadMoveException("Testing");
        throw bme;
    }
}
