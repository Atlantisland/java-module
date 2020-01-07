package academy.everyonecodes.java.week3.set1.exercise1;

import academy.everyonecodes.java.christmas.exercise2.TotalTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalTimeTest {

    TotalTime totalTime= new TotalTime();

    @Test
    void calculateTotalTime() {
        double inputDistanceToTram = 2.5;
        int inputNumberOfStation = 3;
        double inputDistanceToFriend = 15.4;

        double result = totalTime.calculateTotalTime(inputDistanceToTram, inputNumberOfStation, inputDistanceToFriend);

        double expected = 280.5;
        Assertions.assertEquals(expected, result);




    }
}