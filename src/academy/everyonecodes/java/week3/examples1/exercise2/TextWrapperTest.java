package academy.everyonecodes.java.week3.examples1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextWrapperTest {

    TextWrapper textWrapper = new TextWrapper();

    @Test
    void wrappUp() {
        String input = "sentence";

        String result = textWrapper.wrappUp(input);

        String expected = "([sentence])";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void wrappLeft() {
        String input = "sentence";

        String result = textWrapper.wrappLeft(input);

        String expected = "([sentence";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void wrappRight() {
        String input = "sentence";

        String result = "sentence])";

        String expected = "sentence])";
        Assertions.assertEquals(expected, result);
    }
}