package academy.everyonecodes.java.week8.set1.exercise3;

import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class RectangleShaperTest {

    @Test
    void test() {
        RectangleShaper rectangleShaper = new RectangleShaper();
        String resultShape = rectangleShaper.getShape();
        String resultColor = rectangleShaper.getColor();
        String expectedShape = "Rectangle";
        String expectedColor = "Green";
        Assertions.assertEquals(expectedShape, resultShape);
        Assertions.assertEquals(expectedColor, resultColor);

        Colored colored = (Colored) rectangleShaper;
        String coloredResultColor = colored.getColor();
        String coloredExpectedColor = "Green";
        Assertions.assertEquals(coloredExpectedColor, coloredResultColor);

        Shaper shaper = (Shaper) rectangleShaper;
        String shapedResultShape = shaper.getShape();
        String shapedExpectedShape = "Rectangle";
        Assertions.assertEquals(shapedExpectedShape, shapedResultShape);

        List<RectangleShaper> rectangleShapers = List.of(rectangleShaper);
        List<Colored> coloreds = List.of(colored);
        List<Shaper> shapes = List.of(rectangleShaper, shaper);

    }
}