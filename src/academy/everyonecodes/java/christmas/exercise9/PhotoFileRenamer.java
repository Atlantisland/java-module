package academy.everyonecodes.java.christmas.exercise9;

import java.util.List;

public class PhotoFileRenamer {

    //public void renameFile(String oldName, String newName) {
    //   System.out.println("The " + oldName + " has been reanamed to " +newName + ".");
    //}

    public void renameFile() {
        FileNameGenerator fileNameGenerator = new FileNameGenerator();
        PhotoFileNameCollector photoFileNameCollector = new PhotoFileNameCollector();
        List<String> fileNames = photoFileNameCollector.getAllPhotoFileNames();
        for (String fileName : fileNames) {
            String newName = fileNameGenerator.generateNewName(fileName);
            System.out.println("Renaming " + fileName + " to " + newName);
        }
    }
}
