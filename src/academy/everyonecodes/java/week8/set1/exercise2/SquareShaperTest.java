package academy.everyonecodes.java.week8.set1.exercise2;

import academy.everyonecodes.java.week8.set1.exercise1.CircleShaper;
import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareShaperTest {
    @Test
    void getShape() {
        Shaper circleShaper = new CircleShaper();
        assertEquals("Circle", circleShaper.getShape());

        Shaper squareShaper = new SquareShaper();
        assertEquals("Square", squareShaper.getShape());

        Shaper triangleShaper = new TriangleShaper();
        assertEquals("Triangle", triangleShaper.getShape());

        //List<CircleShaper> circleShapers = List.of(circleShaper, squareShaper, triangleShaper);
        // Doesn't work because these variables are of type Shaper

        List<Shaper> shapers = List.of(circleShaper, squareShaper, triangleShaper);
        List<String> result = shapers.stream()
                .map(Shaper::getShape)
                .collect(toList());

        List<String> expected = List.of("Circle", "Square", "Triangle");
        assertEquals(expected, result);
    }
}