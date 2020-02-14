package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddSurfaceTest {
    BuildingStep step = new AddSurface();

    @Test
    void applyUsedOnce() {
        Furniture furniture = new Furniture("Furniture");

        step.apply(furniture);

        Furniture expected = new Furniture("Furniture");
        expected.getParts().add("Surface");
        assertEquals(expected, furniture);
    }

    @Test
    void applyUsedTwice() {
        Furniture furniture = new Furniture("Furniture");

        step.apply(furniture);
        step.apply(furniture);

        Furniture expected = new Furniture("Furniture");
        expected.getParts().add("Surface");
        expected.getParts().add("Surface");
        assertEquals(expected, furniture);
    }

}
