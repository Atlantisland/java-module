package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class AnimalMovementScholar {
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
                .map(Animal::getMovement)
                .findFirst();
    }

    private Optional<String> findByKind(String keyword) {
        String movements = animals.stream()
                .filter(animal -> animal.getKind().equals(keyword))
                .map(Animal::getMovement)
                .collect(joining(","));
        if (movements.isEmpty()) {
            return Optional.empty();
        }
        String distinctMovements = Stream.of(movements.split(","))
                .distinct()
                .sorted()
                .collect(joining(","));
        return Optional.of(distinctMovements);
    }


}
