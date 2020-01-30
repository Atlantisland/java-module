package academy.everyonecodes.java.week2.serciceClassExamples.Exercise3;

import academy.everyonecodes.java.week2.serciceClassExamples.Exercise3.MovieNamePrinter;
import academy.everyonecodes.java.week2.serciceClassExamples.Exercise3.TicketPrinter;

public class ApplicationThree {
    public static void main(String[] args) {
        MovieNamePrinter movieNamePrinter = new MovieNamePrinter();
        TicketPrinter ticketPrinter = new TicketPrinter(movieNamePrinter);

        ticketPrinter.print("Titanic", "20th of December, 1997");
    }
}
