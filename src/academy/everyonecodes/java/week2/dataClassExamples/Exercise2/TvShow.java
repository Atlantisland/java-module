package academy.everyonecodes.java.week2.dataClassExamples.Exercise2;

public class TvShow {
    private String name;
    private int numberOfEpisodes;

    public TvShow(String name, int numberOfEpisodes) {
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
}
