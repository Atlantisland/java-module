package academy.everyonecodes.java.evaluationTwo.exercise1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumberNameShifter {

    NumberNamesDictionary dictionary = new NumberNamesDictionary();

    public List<String> shift(List<String> numbers) {
        return numbers.stream()
                .map(number -> dictionary.getNumber(number))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(number -> number + 1)
                .filter(number -> number <= 9)
                .map(number -> dictionary.getName(number))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

    }
}





