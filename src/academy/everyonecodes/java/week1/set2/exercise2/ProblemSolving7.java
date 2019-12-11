package academy.everyonecodes.java.week1.set2.exercise2;

import java.util.List;
import java.util.ArrayList;

public class ProblemSolving7 {
    public static List<String> combine(List<String> first, List<String> second) {
        List<String> combinedCollection = new ArrayList<>();
        int position = 0;
        while (position < first.size() || position < second.size()) {
            if (position < first.size()) {
                String firstElement = first.get(position);
                combinedCollection.add(firstElement);
            }
            if (position < second.size()) {
                String secondElement = second.get(position);
                combinedCollection.add(secondElement);
            }
            position++;
        }
        return combinedCollection;
    }

    public static void main(String[] args) {
        List<String> first = List.of("one", "three", "five");
        List<String> second = List.of("two", "four");
        List<String> combinedCollection = combine(first, second);
        for (String element : combinedCollection) {
            System.out.println(element);

        }

    }

}
