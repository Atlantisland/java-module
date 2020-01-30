package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;


class LongestNameFinderTest {
    LongestNameFinder finder = new LongestNameFinder();

    @Test
    void findLengthZero() {
        List<Character> characters = List.of();

        Optional<Character> oCharacter = finder.find(characters);

        Assertions.assertTrue(oCharacter.isEmpty());
    }

    @Test
    void findLength1() {
        String name = "Andrea";
        List<Character> characters = List.of(new Character(name, Optional.empty(), "0"));

        Optional<Character> oCharacter = finder.find(characters);

        Assertions.assertTrue(oCharacter.isPresent());
        Assertions.assertEquals(name, oCharacter.get().getName());
    }

    @Test
    void findLength2() {
        List<Character> characters = List.of(new Character("Tom", Optional.empty(), "0"),
                new Character("Andrea", Optional.empty(), "0")
        );

        Optional<Character> oCharacter = finder.find(characters);

        Assertions.assertTrue(oCharacter.isPresent());
        String expected = "Andrea";
        Assertions.assertEquals(expected, oCharacter.get().getName());
    }
}

