package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddLegTest {
    AddLeg addLeg = new AddLeg();

    @Test
    void test() {
        Furniture resultedFurniture = new Furniture("table");
        addLeg.apply(resultedFurniture);
        Furniture expectedFurniture = new Furniture("table");
        expectedFurniture.getParts().add("leg");
        Assertions.assertEquals(expectedFurniture, resultedFurniture);
    }

}