package academy.everyonecodes.java.week5.set1.exercise1;

import java.util.List;
import java.util.Optional;

public class FirstByAgeFinder {

    public Optional<Person> find(List<Person> people, int ageToFind) {
        for (Person person : people) {
            if (person.getAge() == ageToFind) {
                return Optional.of(person);
            }

        }
        return Optional.empty();
    }
}
