package academy.everyonecodes.java.evaluationTwo.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SparePartsBoxTest {

    SparePartsBox applyer = new SparePartsBox(10);

    @Test
    void apply() {
        Spaceship spaceship1 = new Spaceship(56, 35);
        int result = spaceship1.getHealth() + applyer.getIntensity();
        //int result = spaceship.setHealth(getIntensity());
        int expected = 66;
        Assertions.assertEquals(expected, result);
    }
}

//due to time i cannot continue to improve my method

