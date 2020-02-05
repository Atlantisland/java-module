package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HappinessRecord that = (HappinessRecord) o;
        return rank == that.rank &&
                Objects.equals(country, that.country) &&
                Objects.equals(score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, rank, score);
    }
}

