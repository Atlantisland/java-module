package academy.everyonecodes.java.christmas.exercise9;

//import java.util.Scanner;

public class NewName {
    public static String generateNewName(String oldName) {
        //int length = oldName.length();
        //int lastPosition = length - 5;
        //Scanner scanner = new Scanner(System.in);
        //oldName = scanner.nextLine();
        //String nameWithoutEnding = oldName.slice(0, lastPosition);
        //String nameWithoutEnding = oldName.substring(-4, -1);
        String newName = oldName.replace(".jpg", ".png");
        return newName;

    }
}
