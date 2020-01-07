package academy.everyonecodes.java.week3.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeForFirstSeasonTest {
    TimeForFirstSeason timeForFirstSeason = new TimeForFirstSeason();

    @Test
    void getTotalTimeForFirstSeason() {
        int inputNumberOfEpisodes = 12;

        int result = timeForFirstSeason.getTotalTimeForFirstSeason(inputNumberOfEpisodes);

        int expected = 504;
        Assertions.assertEquals(expected, result);

    }
}