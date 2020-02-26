package academy.everyonecodes.java.week8.reflection.exercise1;

import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Cutlery;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Fork;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Knife;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Spoon;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Waiter {

    private List<Cutlery> cutleries = List.of(
            new Spoon(),
            new Fork(),
            new Knife()
    );

    public List<String> getCutlery(String food) {
        return cutleries.stream()
                .filter(cutlery -> cutlery.isUsedFor(food))
                .map(Cutlery::getName)
                .collect(toList());
    }
}

