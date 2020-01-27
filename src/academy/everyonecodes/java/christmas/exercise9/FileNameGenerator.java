package academy.everyonecodes.java.christmas.exercise9;


public class FileNameGenerator {
    //public static String generateNewName(String oldName) {
    //    String newName = oldName.replace(".jpg", ".png");
    //    return newName;

    //}

    public String generateNewName(String oldName) {
        int length = oldName.length();
        int lengthWithoutExtension = length - 4;
        String newName = oldName.substring(0, lengthWithoutExtension);
        newName = newName + " .png";
        return newName;
    }
}
