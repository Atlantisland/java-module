package academy.everyonecodes.java.week5.set2.exercise4;

public class HappinessRecord {
    private String country;
    private int rank;
    private Double score;


    public HappinessRecord(String country, int rank, Double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;

    }

    public String getCountry() {
        return country;
    }

    public int getRank() {
        return rank;
    }

    public double getScore() {
        return score;
    }


}

