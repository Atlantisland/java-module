package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TableBuilderTest {
    TableBuilder tableBuilder = new TableBuilder();

    @Test
    void test() {
        Furniture result = tableBuilder.build();

        Furniture expected = new Furniture("Table");
        expected.getParts().addAll(List.of("Leg", "Leg", "Leg", "Leg", "Surface"));
        assertEquals(expected, result);

    }
}