package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TableBuilderTest {
    TableBuilder tableBuilder = new TableBuilder();

    @Test
    void test(){
        Furniture resultedFurniture = new Furniture("table");
        tableBuilder.build(resultedFurniture);
        Furniture expectedFurniture = new Furniture("table");
        expectedFurniture.getParts().add("leg");
        expectedFurniture.getParts().add("leg");
        expectedFurniture.getParts().add("leg");
        expectedFurniture.getParts().add("leg");
        expectedFurniture.getParts().add("surface");
        Assertions.assertEquals(expectedFurniture, resultedFurniture);
    }

}