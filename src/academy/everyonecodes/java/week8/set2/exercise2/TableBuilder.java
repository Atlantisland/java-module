package academy.everyonecodes.java.week8.set2.exercise2;

import java.util.List;

public class TableBuilder {

    private List<BuildingStep> steps = List.of(new AddLeg(), new AddLeg(), new AddLeg(), new AddLeg(), new AddSurface());

    public Furniture build(Furniture furniture) {
        steps.stream()
                .forEach(step -> step.apply(furniture));
        return furniture;
    }
}
