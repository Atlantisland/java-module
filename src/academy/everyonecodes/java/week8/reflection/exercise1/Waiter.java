package academy.everyonecodes.java.week8.reflection.exercise1;

import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Cutlery;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Fork;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Knife;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Spoon;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    Spoon spoon = new Spoon();
    Fork fork = new Fork();
    Knife knife = new Knife();

    private List<Cutlery> cutleries = List.of(
            new Spoon(),
            new Fork(),
            new Knife()
    );

    public List<Cutlery> getCutlery(String dishName) {
        List<Cutlery> necessaryCutleries = new ArrayList<>();
        if (spoon.isUsedFor(dishName)) {
            necessaryCutleries.add(new Spoon());
            return necessaryCutleries;
        }
        if (fork.isUsedFor(dishName)) {
            necessaryCutleries.add(new Fork());
            return necessaryCutleries;
        }
        if (knife.isUsedFor(dishName)) {
            necessaryCutleries.add(new Knife());
            return necessaryCutleries;
        }
        return necessaryCutleries;
    }
}

