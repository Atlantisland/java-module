package academy.everyonecodes.java.evaluationTwo.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponsUpgradeBoxTest {
    WeaponsUpgradeBox applyer = new WeaponsUpgradeBox(10);

    @Test
    void apply() {
        Spaceship spaceship1 = new Spaceship(56, 35);
        int result = spaceship1.getDamage() + applyer.getIntensity();
        int expected = 45;
        Assertions.assertEquals(expected, result);
    }


}