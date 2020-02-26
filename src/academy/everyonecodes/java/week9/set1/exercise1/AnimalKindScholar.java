package academy.everyonecodes.java.week9.set1.exercise1;


import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.joining;

public class AnimalKindScholar {
    private List<Animal> animals = Animals.get();

    public Optional<String> elaborate(String keyword) {
        Optional<String> oName = findByName(keyword);
        if (oName.isPresent()) {
            return oName;
        }
        return findByKind(keyword);
    }

    private Optional<String> findByName(String keyword) {
        return animals.stream()
                .filter(animal -> animal.getName().equals(keyword))
                .map(Animal::getKind)
                .findFirst();
    }

    private Optional<String> findByKind(String keyword) {
        String names = animals.stream()
                .filter(animal -> animal.getKind().equals(keyword))
                .map(Animal::getName)
                .sorted()
                .collect(joining(","));
        if (names.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(names);
    }

}


