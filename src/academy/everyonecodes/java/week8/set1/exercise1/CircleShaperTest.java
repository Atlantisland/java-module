package academy.everyonecodes.java.week8.set1.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleShaperTest {

    @Test
    void getShape() {
        CircleShaper circleShaper = new CircleShaper();
        String expected = "Circle";
        assertEquals(expected, circleShaper.getShape());

        Shaper shaper = circleShaper;
        assertEquals(expected, circleShaper.getShape());

        Shaper otherShaper = new CircleShaper();
        assertEquals(expected, circleShaper.getShape());
    }
}