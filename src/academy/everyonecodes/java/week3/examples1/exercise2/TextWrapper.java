package academy.everyonecodes.java.week3.examples1.exercise2;

public class TextWrapper {
    public String wrappUp(String text) {
        text = wrappLeft(text);
        text = wrappRight(text);
        return text;
    }

    String wrappLeft(String text) {
        return "([" + text;
    }

    String wrappRight(String text) {
        return text + "])";
    }
}
