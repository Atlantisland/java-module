package academy.everyonecodes.java.optionals.exceptions;

public class WrongFirstArgumentException extends Exception {

    public WrongFirstArgumentException(String text) {
        super("Argument not supported: " + text);
    }
}
