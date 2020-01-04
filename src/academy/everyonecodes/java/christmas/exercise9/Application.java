package academy.everyonecodes.java.christmas.exercise9;

import java.util.List;

import static academy.everyonecodes.java.christmas.exercise9.NewName.generateNewName;
import static academy.everyonecodes.java.christmas.exercise9.PhotoFileName.getAllPhotoFileNames;
import static academy.everyonecodes.java.christmas.exercise9.PhotoFileRename.renameFile;

public class Application {

    public static void main(String[] args) {
        List<String> fileNames = getAllPhotoFileNames();
        for(String fileName : fileNames) {
            String newName = generateNewName(fileName);
            renameFile(fileName, newName);

        }
    }
}
