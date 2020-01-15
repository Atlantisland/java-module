package academy.everyonecodes.java.week4.set2.exercise1;

public class MoveTitleFormatter {
    public String format(String movieTitle) {
        StringCapitalizer stringCapitalizer = new StringCapitalizer();
        if(movieTitle=="") {
            return "";
        }
        String[] wordsTitle = movieTitle.split(" ");
        String result = "";
        for (String wordTitle : wordsTitle) {
            wordTitle = stringCapitalizer.capitalize(wordTitle);
            result = result + " " + wordTitle;
        }
        result = result.trim();

        return result;
    }

}
