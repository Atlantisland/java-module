package academy.everyonecodes.java.week8.set1.exercise2;

import academy.everyonecodes.java.week8.set1.exercise1.CircleShaper;
import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class SquareShaperTest {
    @Test
    void getShape() {
        Shaper circleShaper = new CircleShaper();
        String resultCircle = circleShaper.getShape();
        String expectedCircle = "Circle";
        Assertions.assertEquals(expectedCircle, resultCircle);

        Shaper squareShaper = new SquareShaper();
        String resultSquare = squareShaper.getShape();
        String expectedSquare = "Square";
        Assertions.assertEquals(expectedSquare, resultSquare);

        Shaper triangleShaper = new TriangleShaper();
        String resultTriangle = triangleShaper.getShape();
        String expectedTriangle = "Triangle";
        Assertions.assertEquals(expectedTriangle, resultTriangle);

        //List<CircleShaper> circleShapers = List.of(circleShaper, squareShaper, triangleShaper);
        List<Shaper> shapers = List.of(circleShaper, squareShaper, triangleShaper);
        List<String> result = shapers.stream()
                .map(Shaper::getShape)
                .collect(Collectors.toList());
        List<String> expected = List.of("Circle", "Square", "Triangle");
        Assertions.assertEquals(expected, result);
    }

}