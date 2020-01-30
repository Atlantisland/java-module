package academy.everyonecodes.java.week2.serciceClassExamples.Exercise3;

import academy.everyonecodes.java.week2.serciceClassExamples.Exercise3.MovieNamePrinter;

public class TicketPrinter {
    private MovieNamePrinter movieNamePrinter;

    public TicketPrinter(MovieNamePrinter movieNamePrinter) {
        this.movieNamePrinter = movieNamePrinter;
    }

    public void print(String movieName, String date) {
        movieNamePrinter.print(movieName);
        System.out.println("[" + date + "]");
    }
}
