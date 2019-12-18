package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class StepCollector {
    public List<Integer> collect() {
        List<String> names = List.of("Matilda", "Hansel", "Derek");
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        for (String name : names) {
            System.out.println(name + " what is your number of steps");
            int numberOfSteps = scanner.nextInt();
            scanner.nextLine();
            numbers.add(numberOfSteps);
        }
        return numbers;
    }
}
