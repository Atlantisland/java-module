package academy.everyonecodes.java.week2.serciceClassExamples.examplesTwo;

public class ApplicationThree {
    public static void main(String[] args) {
        MovieNamePrinter movieNamePrinter = new MovieNamePrinter();
        TicketPrinter ticketPrinter = new TicketPrinter(movieNamePrinter);

        ticketPrinter.print("Titanic", "20th of December, 1997");
    }
}
