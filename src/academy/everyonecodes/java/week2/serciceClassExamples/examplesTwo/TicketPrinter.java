package academy.everyonecodes.java.week2.serciceClassExamples.examplesTwo;

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
