package academy.everyonecodes.java.week5.set1.exercise2;

import academy.everyonecodes.java.week5.set1.exercise1.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StringOverlapFinderTest {
    StringOverlapFinder finder = new StringOverlapFinder();

    @Test
    void findWithNoWordOne() {
        String inputOne = "";
        String inputTwo = "java";

        Optional<String> oResult = finder.find(inputOne, inputTwo);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void findWithNoWordTwo() {
        String inputOne = "java";
        String inputTwo = "";

        Optional<String> oResult = finder.find(inputOne, inputTwo);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void findWithOverlappingWithSpace() {
        String inputOne = " ";
        String inputTwo = " java";

        Optional<String> oResult = finder.find(inputOne, inputTwo);
        //System.out.printf("k"+oResult.get());
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(" ", oResult.get());
    }

    @Test
    void findWithOverlapping() {
        String inputOne = "laptop";
        String inputTwo = "toptip";

        Optional<String> oResult = finder.find(inputOne, inputTwo);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals("top", oResult.get());
    }

    @Test
    void findNoOverlapping() {
        String inputOne = "java";
        String inputTwo = "python";

        Optional<String> oResult = finder.find(inputOne, inputTwo);
        //System.out.println("test"+oResult.get()+"test");
        Assertions.assertTrue(oResult.isEmpty());
    }

}