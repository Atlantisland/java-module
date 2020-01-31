package academy.everyonecodes.java.evaluation1.exercise2;

public class PictureNameExtractor {
    public String extract(String fileName) {
        String filenameWithoutDate = removeDate(fileName);
        String filenameWithoutDatePicJpg = removePicJpg(filenameWithoutDate);
        String filenameWithoutDatePicJpgLowerCase = transformLowerCase(filenameWithoutDatePicJpg);
        String finalName = substitute(filenameWithoutDatePicJpgLowerCase);
        return finalName;
    }

    private String removeDate(String fileName) {
        int length = fileName.length();
        String result = fileName.substring(8, length - 1);
        return result;
    }

    private String removePicJpg(String fileName) {
        int length = fileName.length();
        String result = fileName.substring(0, length - 6);
        return result;
    }

    private String transformLowerCase(String fileName) {
        String result = fileName.toLowerCase();
        return result;
    }

    private String substitute(String fileName) {
        String result = fileName.replace("-", " ");
        return result;
    }
}
