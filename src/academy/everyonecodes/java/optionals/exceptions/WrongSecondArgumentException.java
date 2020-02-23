package academy.everyonecodes.java.optionals.exceptions;

public class WrongSecondArgumentException extends Exception {

    public WrongSecondArgumentException(String text) {
        super("Argument not supported: " + text);
    }
}
