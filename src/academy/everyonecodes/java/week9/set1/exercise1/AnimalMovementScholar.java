package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalMovementScholar {
    private List<Animal> animals = Animals.get();

    public List<String> elaborate(String keyword) {
            if (!getMovementKind(keyword).isEmpty()) {
                return getMovementKind(keyword);
            } else {
            if (!getDistinctMovementsKind(keyword).isEmpty()) {
                return getDistinctMovementsKind(keyword);
            }
        }
        return new ArrayList<>();
    }

    private List<String> getMovementKind(String keyword) {
        return animals.stream()
                .filter(animal -> animal.getName().equals(keyword))
                .flatMap(animal -> animal.getMovement().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    private List<String> getDistinctMovementsKind(String keyword) {
        return animals.stream()
                .filter(animal -> animal.getKind().equals(keyword))
                .flatMap(animal -> animal.getMovement().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

}
