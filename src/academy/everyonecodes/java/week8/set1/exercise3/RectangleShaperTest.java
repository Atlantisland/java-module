package academy.everyonecodes.java.week8.set1.exercise3;

import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleShaperTest {

    @Test
    void test() {
        RectangleShaper rectangleShaper = new RectangleShaper();
        assertEquals("Rectangle", rectangleShaper.getShape());
        assertEquals("Green", rectangleShaper.getColor());

        Colored colored = (Colored) rectangleShaper;
        assertEquals("Green", colored.getColor());

        Shaper shaper = (Shaper) rectangleShaper;
        assertEquals("Rectangle", shaper.getShape());

        List<RectangleShaper> rectangleShapers = List.of(rectangleShaper);
        List<Colored> coloreds = List.of(colored);
        List<Shaper> shapers = List.of(shaper);
    }

}