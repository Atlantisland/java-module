package academy.everyonecodes.java.week2.examples;

import java.util.List;

public class ApplicationOne {
    public static void main(String[] args) {
        TvShow friends = new TvShow("Friends", 23);
        TvShow homeland = new TvShow("Homeland", 34);
        TvShow prisonBreak = new TvShow("PrisonBreak", 45);

        List<TvShow> shows = List.of(friends, homeland, prisonBreak);

        for (TvShow show : shows) {
            System.out.println("The tv show '" + show.getName() + " ' has " + show.getNumberOfEpisodes() + " episodes.");
        }

    }
}
