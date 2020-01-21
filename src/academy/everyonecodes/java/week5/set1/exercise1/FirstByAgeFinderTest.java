package academy.everyonecodes.java.week5.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FirstByAgeFinderTest {
    FirstByAgeFinder finder = new FirstByAgeFinder();

    @Test
    void findWithDifferentAge() {
        Person hansel = new Person("Hansel", 23);
        List<Person> inputPersons = List.of(hansel);
        int inputAge = 24;

        Optional<Person> oPerson = finder.find(inputPersons, inputAge);

        Assertions.assertTrue(oPerson.isEmpty());

    }

    @Test
    void findEmptyList() {
        Person hansel = new Person("Hansel", 23);
        List<Person> inputPersons = List.of();
        int inputAge = 23;

        Optional<Person> oPerson = finder.find(inputPersons, inputAge);

        Assertions.assertTrue(oPerson.isEmpty());

    }

    @Test
    void findWithFirstElement() {
        Person hansel = new Person("Hansel", 23);
        Person mugatu = new Person("Mugatu", 25);
        List<Person> inputPersons = List.of(hansel, mugatu);
        int inputAge = 23;

        Optional<Person> oPerson = finder.find(inputPersons, inputAge);

        Assertions.assertTrue(oPerson.isPresent());
        Assertions.assertEquals("Hansel", oPerson.get().getName());

    }

    @Test
    void findWithSecondElement() {
        Person hansel = new Person("Hansel", 25);
        Person mugatu = new Person("Mugatu", 23);
        List<Person> inputPersons = List.of(hansel, mugatu);
        int inputAge = 23;

        Optional<Person> oPerson = finder.find(inputPersons, inputAge);

        Assertions.assertTrue(oPerson.isPresent());
        Assertions.assertEquals("Mugatu", oPerson.get().getName());


    }


    @Test
    void findWithNoElementAccepted() {
        Person hansel = new Person("Hansel", 22);
        Person mugatu = new Person("Mugatu", 25);
        List<Person> inputPersons = List.of(hansel, mugatu);
        int inputAge = 23;

        Optional<Person> oPerson = finder.find(inputPersons, inputAge);

        Assertions.assertTrue(oPerson.isEmpty());

    }

}