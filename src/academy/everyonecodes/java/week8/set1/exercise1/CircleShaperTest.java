package academy.everyonecodes.java.week8.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleShaperTest {

    @Test

    void getShapeWithCircle(){
        CircleShaper circleShaper = new CircleShaper();
        String resultOne = circleShaper.getShape();
        String expectedOne = "Circle";
        Assertions.assertEquals(expectedOne, resultOne);

        Shaper shaper = new CircleShaper();
        String resultTwo = shaper.getShape();
        String expectedTwo = "Circle";
        Assertions.assertEquals(expectedTwo, resultTwo);

        Shaper anotherShaper = new CircleShaper();
        String resultThree = anotherShaper.getShape();
        String expectedThree = "Circle";
        Assertions.assertEquals(expectedThree, resultThree);

    }

}