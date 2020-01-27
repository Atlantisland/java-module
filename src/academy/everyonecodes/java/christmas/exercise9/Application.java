package academy.everyonecodes.java.christmas.exercise9;


public class Application {

    //public static void main(String[] args) {
    //   List<String> fileNames = getAllPhotoFileNames();
    //   for(String fileName : fileNames) {
    //       String newName = generateNewName(fileName);
    //       renameFile(fileName, newName);
    public static void main(String[] args) {
        PhotoFileRenamer renamer = new PhotoFileRenamer();
        renamer.renameFile();
    }

}
