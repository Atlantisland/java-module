package academy.everyonecodes.java.optionals.sets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class PersonListDuplicateRemoverTest {

    PersonListDuplicateRemover remover = new PersonListDuplicateRemover();

    static Stream<Arguments> parameters() {
        Person person1 = new Person("Hannes", 20);
        Person person2 = new Person("Derek", 18);
        Person person3 = new Person("Mugatu", 45);

        return Stream.of(
                Arguments.of(List.of(person1, person2, person3), List.of(person1, person2, person3, person3)),
                Arguments.of(List.of(person1), List.of(person1, person1, person1)),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void remove(List<Person> expected, List<Person> people) {
        List<Person> result = remover.remove(people);

        Assertions.assertEquals(expected, result);
    }
}