package academy.everyonecodes.java.week9.set1.exercise1;


import java.util.List;
import java.util.stream.Collectors;

public class AnimalKindScholar {
    private List<Animal> animals = Animals.get();

    public String elaborate(String keyword) {

        if (!getAnimalName(keyword).isBlank()) {
            return getAnimalName(keyword);
        } else {
            if (!getKind(keyword).isBlank()) {
                return getKind(keyword);
            }
        }
        return "";
    }

    private String getAnimalName(String keyword) {
        return animals.stream()
                .filter(animal -> animal.getKind().equals(keyword))
                .map(Animal::getName)
                .sorted()
                .collect(Collectors.joining(", "));
    }

    private String getKind(String keyword) {
        return animals.stream()
                .filter(animal -> animal.getName().equals(keyword))
                .map(Animal::getKind)
                .distinct()
                .collect(Collectors.joining(""));
    }
}


