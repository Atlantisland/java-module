package academy.everyonecodes.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalkingTimeTest {

    WalkingTime walkingTime = new WalkingTime();

    @Test
    void calculateWalkingTime() {
        double inputDistance = 5.0;

        double result = walkingTime.calculateWalkingTime(inputDistance);

        double expected = 75;
        Assertions.assertEquals(expected, result);

    }
}