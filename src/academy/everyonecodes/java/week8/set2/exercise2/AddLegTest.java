package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddLegTest {
    BuildingStep step = new AddLeg();


    @Test
    void applyUsedOnce() {
        Furniture furniture = new Furniture("Furniture");

        step.apply(furniture);

        Furniture expected = new Furniture("Furniture");
        expected.getParts().add("Leg");
        assertEquals(expected, furniture);
    }

    @Test
    void applyUsedTwice() {
        Furniture furniture = new Furniture("Furniture");

        step.apply(furniture);
        step.apply(furniture);

        Furniture expected = new Furniture("Furniture");
        expected.getParts().add("Leg");
        expected.getParts().add("Leg");
        assertEquals(expected, furniture);
    }

}
