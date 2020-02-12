package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddSurfaceTest {
    AddSurface addSurface = new AddSurface();

    @Test
    void test(){
        Furniture resultedFurniture = new Furniture("table");
        addSurface.apply(resultedFurniture);
        Furniture expectedFurniture = new Furniture("table");
        expectedFurniture.getParts().add("surface");
        Assertions.assertEquals(expectedFurniture, resultedFurniture);
    }

}