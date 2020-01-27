package academy.everyonecodes.java.week5.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;


class FirstByAgeFinderTest {
    FirstByAgeFinder finder = new FirstByAgeFinder();

    @Test
    void findReturnsEmptyOptionalForEmptyList() {
        List<Person> people = List.of();
        int ageToFind = 21;

        Optional<Person> result = finder.find(people, ageToFind);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void findReturnsEmptyOptionalForListWithoutAge() {
        Person person1 = new Person("Mary", 28);
        Person person2 = new Person("Steven", 24);
        List<Person> people = List.of(person1, person2);
        int ageToFind = 21;

        Optional<Person> oResult = finder.find(people, ageToFind);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void findReturnsCorrectPersonForListWithAge() {
        Person person1 = new Person("Mary", 28);
        Person person2 = new Person("Steven", 24);
        List<Person> people = List.of(person1, person2);
        int ageToFind = 28;

        Optional<Person> oResult = finder.find(people, ageToFind);

        Assertions.assertTrue(oResult.isPresent());
        Person oResultPerson = oResult.get();
        String oExpectedName = "Mary";
        int oExpectedAge = 28;
        Assertions.assertEquals(oExpectedName, oResultPerson.getName());
        Assertions.assertEquals(oExpectedAge, oResultPerson.getAge());
    }
}
