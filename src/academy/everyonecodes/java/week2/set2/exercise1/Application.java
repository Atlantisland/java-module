package academy.everyonecodes.java.week2.set2.exercise1;

public class Application {

    public static void main(String[] args) {
        Article article = new Article("Java Week 1", " I did not know if I should cry or laugh");
        Printer printer = new Printer();

        printer.print(article);

    }

}
