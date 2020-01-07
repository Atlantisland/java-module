package academy.everyonecodes.java.week3.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewNameTest {
    NewName newName = new NewName();

    @Test
    void generateNewName() {
        String inputOldName = "photo3.jpg";

        String result = newName.generateNewName(inputOldName);

        String expected = "photo3.png";
        Assertions.assertEquals(expected, result);
    }

}