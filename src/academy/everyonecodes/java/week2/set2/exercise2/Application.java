package academy.everyonecodes.java.week2.set2.exercise2;

import academy.everyonecodes.java.week2.set2.exercise1.Article;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();

        Printer printer = new Printer();
        printer.print(editor.writeMagazine());
    }
}
