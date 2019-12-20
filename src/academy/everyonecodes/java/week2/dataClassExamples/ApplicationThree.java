package academy.everyonecodes.java.week2.dataClassExamples;

import java.util.List;

public class ApplicationThree {
    public static void main(String[] args) {
        BookEntry harryPotter1 = new BookEntry("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997);
        BookEntry taleOfTwoCities = new BookEntry("A Tale of Two Cities", "Charles Dickens", 1859);
        BookEntry lordOfLoops = new BookEntry("The Lord of the Rings", "J. R. R. Tolkien", 1954);

        List<BookEntry> bookEntries = List.of(harryPotter1, taleOfTwoCities, lordOfLoops);
        Library everyoneReadsLibrary = new Library("everyone reads", bookEntries);

        for (BookEntry bookEntry : everyoneReadsLibrary.getBooks()) {
            System.out.println("'" + bookEntry.getTitle() + "'was authored by " + bookEntry.getAuthor());
        }
    }
}

